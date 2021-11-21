package templates;

import java.util.ArrayList;

public class Rule {
    Nterm nterm;
    String code;
    ArrayList <MyToken> instance;
    public static ArrayList<Rule> makeRules(String _nterm, String context) {
        ArrayList<Rule> res = new ArrayList<>();
        String[] c = context.split("\\|");
        for (int i = 0; i < c.length; i++) {
            String[] body = c[i].split("::");
            //assert(body.length == 2);
            String[] tokens = body[0].split(",");
            ArrayList<MyToken> curInstance = new ArrayList<>();
            for (int j = 0; j < tokens.length; j++) if (!tokens[j].isEmpty()) {
                if (tokens[j].contains("{")) {
                    String[] x = tokens[j].split("\\{");
                    curInstance.add(new Nterm(x[0].substring(0, x[0].length() - 1), x[1].substring(0, x[1].length() - 2)));
                } else {
                    if (tokens[j].equals("EPSILON")) {
                        curInstance.add(new Epsilon());
                    } else if (Character.isUpperCase(tokens[j].charAt(0))) {
                        curInstance.add(new Term(tokens[j]));
                    } else {
                        curInstance.add(new Nterm(tokens[j]));
                    }
                }
            }
            if (body.length == 2) {
                res.add(new Rule(_nterm, curInstance, body[1].substring(2, body[1].length() - 2)));
            } else {
                res.add(new Rule(_nterm, curInstance, ""));
            }
         }
        return res;
    }
    public Rule(String _nterm, ArrayList<MyToken> _instance, String _code) {
        nterm = new Nterm(_nterm);
        instance = new ArrayList<>(_instance);
        code = _code;
    }

}
