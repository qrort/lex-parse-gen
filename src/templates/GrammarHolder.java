package templates;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;

public class GrammarHolder {
    ArrayList<MyToken> myTokens;
    ArrayList<Rule> rules;
    String grammarName, skip, start, funcs;
    ArrayList<String> type, init;
    HashMap<Nterm, HashSet<MyToken>> first, follow;
    HashMap<String, String> signs;

    public void setStart(String x) {
        start = x;
    }

    public void setSigns(ArrayList<String> x) {
        signs = new HashMap<>();
        for (String el : x) {
            String[] s = el.split("\\{");
            signs.put(s[0].substring(0, s[0].length() - 1), s[1].substring(0, s[1].length() - 2));
        }
    }

    public void addFuncs(String s) {
        funcs = s;
    }

    public void setAttr(ArrayList<String> x) {
        type = new ArrayList<>();
        init = new ArrayList<>();
        for (int i = 0; i < x.size(); i += 2) {
            type.add(x.get(i));
            init.add(x.get(i + 1).substring(1, x.get(i + 1).length() - 1));
        }
    }

    public void addTokens(ArrayList<MyToken> _tokens) {
        for (int i = 0; i < _tokens.size(); i++) {
            myTokens.add(_tokens.get(i));
        }
    }

    public void addRules(ArrayList<Rule> _rules) {
        for (int i = 0; i < _rules.size(); i++) {
            rules.add(_rules.get(i));
        }
    }

    public void setName(String name) {
        grammarName = name;
    }

    public void setBlanks(String x) {
        skip = x.substring(2, x.length() - 2);
    }

    public String getName() {
        return grammarName;
    }

    public GrammarHolder() {
        myTokens = new ArrayList<>();
        rules = new ArrayList<>();
    }

    public void generateLexer() throws IOException {
        makeEnum();
        BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("/home/qrort/hw/mt/lab3/src/generated/" + grammarName + "Lexer.java"));
        StringBuilder code = new StringBuilder();
        code.append("package generated;\n" +
                "\n" +
                "import templates.BasicLexer;\n" +
                "import templates.LexException;\n" +
                "import static generated.Enum.*;\n" +
                "\n" +
                "import java.io.IOException;\n" +
                "import java.util.regex.Pattern;\n" +
                "\n");
        code.append(
                "public class " + grammarName + "Lexer extends BasicLexer {\n" +
                        "    public " + grammarName + "Lexer(String file) throws IOException, LexException {\n" +
                        "        super(file);\n" +
                        "    }\n");

        code.append(makeBlankBody());
        code.append("\n" + "\n" + "    @Override\n" + "    public void nextToken() throws LexException {\n" + "    ");
        code.append(makeNextTokenBody());
        code.append("    }\n" +
                "}\n");

        bufferedWriter.write(code.toString());
        bufferedWriter.close();
    }

    public void generateTree() throws IOException {
        BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("/home/qrort/hw/mt/lab3/src/generated/" + grammarName + "Tree.java"));
        StringBuilder code = new StringBuilder();
        code.append("package generated;\n" +
                "\n" +
                "import templates.Tree;\n" +
                "\n" +
                "public class " + grammarName + "Tree extends Tree {\n");
        for (int i = 0; i < type.size(); i++) {
            code.append("    public ").append(type.get(i)).append(" value").append(i).append(" = ").append(init.get(i)).append(";\n");
        }
        code.append("\n" +
                "    public " + grammarName + "Tree(String _node) {\n" +
                "        super(_node);\n" +
                "    }\n" +
                "\n" +
                "    public " + grammarName + "Tree(String _node, Tree[] _children) {\n" +
                "        super(_node, _children);\n" +
                "    }");

        if (!type.isEmpty()) {
        code.append("    public " + grammarName + "Tree(String _node, ");
        for (int i = 0; i < type.size(); i++) {
            code.append(type.get(i)).append(" _value").append(i);
            if (i + 1 < type.size()) code.append(", ");
        }
        code.append(") {\n" +
                "        super(_node);\n");
        for (int i = 0; i < type.size(); i++) {
            code.append("value").append(i).append(" = _value").append(i).append(";\n");
        }
        code.append("    }\n" +
                "\n" +
                "    public " + grammarName + "Tree(String _node, ");
        for (int i = 0; i < type.size(); i++) {
            code.append(type.get(i)).append(" _value").append(i).append(", ");
        }
        code.append("Tree[] _children) {\n" +
                "        super(_node, _children);\n");
        for (int i = 0; i < type.size(); i++) {
            code.append("value").append(i).append(" = _value").append(i).append(";\n");
        }
        code.append("    }\n");
        }
     code.append("}\n");
        bufferedWriter.write(code.toString());
        bufferedWriter.close();
    }

    public void generateParser() throws IOException {
        generateTree();
        calculateFirst();
        calculateFollow();
        BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("/home/qrort/hw/mt/lab3/src/generated/" + grammarName + "Parser.java"));
        StringBuilder code = new StringBuilder();
        code.append("package generated;\n" +
                "\n" +
                "import templates.BasicParser;\n" +
                "import templates.ParseException;\n" +
                "import templates.LexException;\n" +
                "import static generated.Enum.*;\n" +
                "\n" +
                "public class " + grammarName + "Parser extends BasicParser {\n" +
                "    " + grammarName + "Lexer lex;\n" +
                "    public " + grammarName + "Parser(" + grammarName + "Lexer _lex) {\n" +
                "        lex = _lex;\n" +
                "    }\n" +
                "    \n@Override\n" +
                "        public " + grammarName + "Tree parse() throws LexException, ParseException {\n");
        code.append(makeParseBody());
        code.append(
                "    }\n\n");
        if (!funcs.isEmpty()) {
            code.append(funcs.substring(2, funcs.length() - 2)).append("\n");
        }
        code.append(makeParserRules());
        code.append("}\n");
        bufferedWriter.write(code.toString());
        bufferedWriter.close();
    }

    private StringBuilder makeParserRules() {
        StringBuilder res = new StringBuilder();
        for (Map.Entry<Nterm, HashSet<MyToken>> entry : first.entrySet()) {
            res.append("    " + grammarName + "Tree ").append(entry.getKey().name).append("(");
            String signature = signs.getOrDefault(entry.getKey().name, "");
            if (!signature.isEmpty()) {
                res.append(signature);
            }
            res.append(") throws LexException, ParseException {\n");
            for (int i = 0; i < type.size(); i++) {
                res.append("        " + type.get(i) + " value" + i + " = " + init.get(i) + ";\n");
            }
            res.append("        switch (lex.curToken()) {\n");
            for (Rule rule : rules) {
                if (rule.nterm.equals(entry.getKey())) {
                    MyToken f = rule.instance.get(0);
                    HashSet<MyToken> tmp;
                    if (f instanceof Nterm) {
                        tmp = first.getOrDefault(f, new HashSet<>());
                    } else {
                        tmp = new HashSet<>();
                        tmp.add(f);
                    }
                    if (tmp.contains(new Epsilon())) {
                        tmp.remove(new Epsilon());
                        tmp.addAll(follow.getOrDefault(rule.nterm, new HashSet<>()));
                    } else {
                        tmp.remove(new Epsilon());
                    }
                    for (MyToken token : tmp) {
                        res.append("            case " + token.name + ": {\n");
                        int cnt = 0;
                        boolean done = false;
                        for (int i = 0; i < rule.instance.size(); i++) {
                            MyToken expected = rule.instance.get(i);
                            if (expected instanceof Nterm) {
                                res.append("                " + grammarName + "Tree t").append(cnt).append(" = ").append(expected.name).append("(");
                                if (!((Nterm) expected).attrs.isEmpty()) {
                                    res.append(((Nterm) expected).attrs);
                                }
                                res.append(");\n");
                            } else if (expected instanceof Term || expected instanceof Dollar) {
                                res.append("                if (lex.curToken() != ").append(expected.name).append(") {\n");
                                res.append("                    throw new ParseException(\"expected\" + " + expected.name + " + \",\" + lex.curPos());\n");
                                res.append("                }\n");
                                if (expected instanceof Term) {
                                    res.append("                lex.nextToken();\n");
                                }
                            } else if (expected instanceof Epsilon) {
                                assert (rule.instance.size() == 1);
                                res.append("\n\n").append(rule.code).append("\n\n");
                                res.append("                return new " + grammarName + "Tree(\"").append(rule.nterm.name).append("\"");
                                for (int j = 0; j < type.size(); j++) {
                                    res.append(", value" + j);
                                }
                                res.append(");\n");
                                done = true;
                            }
                            cnt++;
                        }
                        if (!done) {
                            cnt = 0;
                            res.append("\n\n").append(rule.code).append("\n\n");
                            res.append("                return new " + grammarName + "Tree(\"").append(rule.nterm.name).append("\"");
                            for (int j = 0; j < type.size(); j++) {
                                res.append(", value" + j);
                            }
                            res.append(", new " + grammarName + "Tree[]{");
                            for (int i = 0; i < rule.instance.size(); i++) {
                                MyToken expected = rule.instance.get(i);
                                if (expected instanceof Nterm) {
                                    res.append("t").append(cnt);
                                } else {
                                    res.append("new " + grammarName + "Tree(\"").append(expected.name).append("\")");
                                }
                                if (i + 1 != rule.instance.size()) res.append(", ");
                                cnt++;
                            }
                            res.append("});\n");
                        }
                        res.append("            }\n");
                    }
                }
            }
            res.append("            default: {\n");
            res.append("                throw new ParseException(\"Unexpected token\" + lex.curToken(), lex.curPos());\n");
            res.append("            }\n");
            res.append("        }\n");
            res.append("    }\n");
        }
        return res;

    }

    private StringBuilder makeParseBody() {
        StringBuilder res = new StringBuilder();
        res.append("        return ").append(start).append("();\n");
        return res;
    }

    public void printSets() {
        for (Map.Entry<Nterm, HashSet<MyToken>> entry : first.entrySet()) {
            System.out.println("first for " + entry.getKey().name + " is\n");
            for (MyToken token : entry.getValue()) {
                if (token instanceof Term) {
                    System.out.println(((Term) token).name);
                } else if (token instanceof Epsilon) {
                    System.out.println(((Epsilon) token).name);
                } else {
                    assert (false);
                }
            }
        }
        for (Map.Entry<Nterm, HashSet<MyToken>> entry : follow.entrySet()) {
            System.out.println("follow for " + entry.getKey().name + " is\n");
            for (MyToken token : entry.getValue()) {
                if (token instanceof Term) {
                    System.out.println(((Term) token).name);
                } else if (token instanceof Epsilon) {
                    System.out.println(((Epsilon) token).name);
                } else if (token instanceof Dollar) {
                    System.out.println(((Dollar) token).name);
                } else {
                    assert (false);
                }
            }
        }
    }

    public StringBuilder makeBlankBody() {
        StringBuilder res = new StringBuilder();
        res.append("    @Override\n" +
                "    public boolean blank() {\n");
        res.append("        if (");
        String cur = "";
        for (int i = 0; i < skip.length(); i++) {
            cur += skip.charAt(i);
            if (skip.charAt(i) != '\\') {
                res.append("(curChar() == '").append(cur).append("') || ");
                cur = "";
            }
        }
        res = new StringBuilder(res.substring(0, res.length() - 4));
        res.append(") return true; else return false;\n");
        res.append("    }\n");
        return res;
    }

    public StringBuilder makeNextTokenBody() {
        StringBuilder res = new StringBuilder();
        res.append("    boolean done = false;\n");
        res.append("        while (blank()) nextChar();\n" +
                "        ");
        res.append("old = text;\n");
        res.append("text = \"\";\n");
        myTokens.add(new Dollar());
        for (MyToken token : myTokens) {
            if (token instanceof Term) {
                res.append("        while (Pattern.matches(");
                res.append(((Term) token).regex);
                res.append(", String.valueOf(cur))) {\n");
                res.append("            token = ");
                res.append(((Term) token).name);
                res.append(";\n");
                res.append("            text += cur;\n");
                res.append("            done = true;\n");
                if (token instanceof Dollar) {
                    res.append("            break;\n");
                } else {
                    res.append("            nextChar();\n");
                }
                res.append("        }\n");
                res.append("        if (done) return;\n");
            }
        }
        myTokens.remove(myTokens.size() - 1);
        res.append("        throw new LexException(\"Invalid character \" + curChar(), curPos());\n");
        return res;
    }

    void makeEnum() throws IOException {
        BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("/home/qrort/hw/mt/lab3/src/generated/Enum.java"));
        StringBuilder res = new StringBuilder();
        res.append("package generated;\n");
        res.append("public enum Enum {\n");
        res.append("    ");
        for (MyToken token : myTokens) {
            if (token instanceof Term) {
                res.append(((Term) token).name);
                res.append(',');
            }
        }
        res.append("EPSILON, DOLLAR\n}\n");
        bufferedWriter.write(res.toString());
        bufferedWriter.close();
    }

    private HashSet<MyToken> getRuleSet(Rule rule, int index) {
        HashSet<MyToken> res = new HashSet<>();
        if (rule.instance.isEmpty() || (rule.instance.size() == 1 && rule.instance.get(0) instanceof Epsilon) || rule.instance.size() == index) {
            res.add(new Epsilon());
            return res;
        }
        MyToken f = rule.instance.get(index);
        if (f instanceof Term) {
            res.add(f);
            return res;
        } else if (f instanceof Nterm) {
            res = (HashSet<MyToken>) first.getOrDefault(f, new HashSet<>()).clone();
            if (res.contains(new Epsilon())) {
                HashSet<MyToken> cur = getRuleSet(rule, index + 1);
                res.addAll(cur);
            }
            return res;
        }
        assert (false);
        return res;
    }

    public void calculateFirst() {
        first = new HashMap<>();
        boolean changed = true;
        while (changed) {
            changed = false;
            for (Rule rule : rules) {
                HashSet<MyToken> old = first.getOrDefault(rule.nterm, new HashSet<>());
                HashSet<MyToken> nw = getRuleSet(rule, 0);
                nw.addAll(old);
                if (!old.containsAll(nw)) {
                    changed = true;
                    first.put(rule.nterm, nw);
                }
            }
        }
    }

    public void calculateFollow() {
        follow = new HashMap<>();
        HashSet<MyToken> tmp = new HashSet<>();
        tmp.add(new Dollar());
        follow.put(new Nterm(start), tmp);
        boolean changed = true;
        while (changed) {
            changed = false;
            for (Rule rule : rules) {
                for (int i = 0; i < rule.instance.size(); i++) {
                    MyToken token = rule.instance.get(i);
                    if (token instanceof Nterm) {
                        HashSet<MyToken> old = follow.getOrDefault(token, new HashSet<>());
                        HashSet<MyToken> nw = new HashSet<>(old);
                        HashSet<MyToken> tokenFirst = getRuleSet(rule, i + 1);
                        for (MyToken symbol : tokenFirst) {
                            if (symbol instanceof Term) {
                                nw.add(symbol);
                            }
                        }
                        if (tokenFirst.contains(new Epsilon())) {
                            tmp = follow.getOrDefault(rule.nterm, new HashSet<>());
                            nw.addAll(tmp);
                        }
                        if (!old.containsAll(nw)) {
                            changed = true;
                            follow.put((Nterm) token, nw);
                        }
                    }
                }
            }
        }
    }
}