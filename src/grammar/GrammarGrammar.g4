grammar GrammarGrammar;

@header{
    import java.util.*;
    import templates.*;
}

start returns [GrammarHolder val = new GrammarHolder()]:
    name blanks startS attrs lexems signs funcs rules EOF {
        $val.setBlanks($blanks.reg);
        $val.setStart($startS.val);
        $val.setAttr($attrs.vals);
        $val.setName($name.value);
        $val.addTokens($lexems.toks);
        $val.setSigns($signs.vals);
        $val.addFuncs($funcs.val);
        $val.addRules($rules.ruls);
    };

signs returns [ArrayList<String> vals = new ArrayList<>()]:
    (SIGN LB (s=sign{$vals.add($s.val);})+ RB) | {};

sign returns [String val]:
    NTERM attrValue SEMICOLON {
        $val = $NTERM.text + $attrValue.value.toString();
    };

funcs returns [String val]:
    FUNC CODE {
        $val = $CODE.text;
    } | {
        $val = "";
    };

name returns [String value]:
    NAME LB NTERM RB {
        $value = $NTERM.text;
    };

blanks returns [String reg]:
    BLANKS LB REGEX RB {
        $reg = $REGEX.text;
    }
    | {
        $reg = "";
    };

startS returns [String val]:
    STARTS LB NTERM RB {
        $val = $NTERM.text;
    };

attrs returns [ArrayList <String> vals = new ArrayList<>()]:
    (ATTR LB (ai = attr { $vals.add($ai.v1); $vals.add($ai.v2);})+ RB) | {};

attr returns [String v1, String v2]:
    NTERM '=' REGEX SEMICOLON {
        $v1 = $NTERM.text;
        $v2 = $REGEX.text;
    };

lexems returns [ArrayList<MyToken> toks = new ArrayList<>()]:
    TOKENS LB (li = nextLexem {$toks.add($li.val);})+ RB;

nextLexem returns [MyToken val]:
    TERM DCOLON REGEX SEMICOLON {
        $val = new Term($TERM.text, $REGEX.text);
    };

rules returns [ArrayList<Rule> ruls = new ArrayList<>()]:
    RULES LB (ri = nextRule {$ruls.addAll($ri.ruleList);})+ RB;

nextRule returns [ArrayList<Rule> ruleList]:
    NTERM DCOLON ruleContent {
        $ruleList = Rule.makeRules($NTERM.text, $ruleContent.content.toString());
    };

ruleContent returns [StringBuilder content = new StringBuilder()]:
    ri = ruleInstance rcc = ruleContentContinuation {
        $content.append($ri.value);
        $content.append($rcc.content);
    };

ruleContentContinuation returns [StringBuilder content = new StringBuilder()]:
    VERT ri = ruleInstance rcc = ruleContentContinuation {
        $content.append($VERT.text);
        $content.append($ri.value);
        $content.append($rcc.content);
    }
    |
    SEMICOLON {
    };

ruleInstance returns [StringBuilder value = new StringBuilder()]:
    LBS tokenSequence c1=codeValue RBS {
        $value.append($tokenSequence.value);
        $value.append($c1.value);
    };

tokenSequence returns [StringBuilder value = new StringBuilder()]:
    t0=tokenInstance COMMA t1=tokenSequence {
        $value.append($t0.value);
        $value.append(",");
        $value.append($t1.value);
    }
    |
    body=tokenInstance {
        $value.append($body.value);
    };

tokenInstance returns [StringBuilder value = new StringBuilder()]:
    t1 = (NTERM | TERM) c1 = attrValue {
        $value.append($t1.text);
        $value.append($c1.value);
    }
    |
    t1 = (NTERM | TERM) {
        $value.append($t1.text);
    };

codeValue returns [StringBuilder value = new StringBuilder()]:
    DCOLON CODE {
        $value.append($DCOLON.text);
        $value.append($CODE.text);
    } | {
    };

attrValue returns [StringBuilder value = new StringBuilder()]:
    CODE {
        $value.append($CODE.text);
    } | {
};
WHITESPACE : [ \t\r\n]+ -> skip;
TOKENS : '@tokens';
RULES : '@rules';
NAME : '@name';
BLANKS : '@blank';
STARTS : '@start';
ATTR : '@returns';
SIGN : '@signatures';
FUNC : '@functions';
DCOLON : '::';
fragment SMALL_LETTER : [a-z];
fragment BIG_LETTER : [A-Z];
fragment LETTER : [a-zA-Z];
fragment DIGIT : [0-9];
fragment SPECIAL : '<' | '>' | '&' | '*' | '+' | '-' | '=' | '/' | ';' | '.' | '@' | '(' | ')' | '{' | '}' | '_';
TERM : (BIG_LETTER|'_')+;
NTERM : SMALL_LETTER (LETTER | '_')*;
REGEX : QUOTE (WHITESPACE | LETTER | DIGIT | '[' | ']' | '(' | ')' | '*' | '-' | '+' | '?' | '\\' | '/' | '!' | '|')+ QUOTE;
fragment CODE_SYMBOL : WHITESPACE | LETTER | DIGIT | SPECIAL;
LB : '{';
RB : '}';
fragment TAG : '#';
CODE: TAG LB CODE_SYMBOL+ RB TAG;
LBS : '(';
RBS : ')';
QUOTE : '"';
SEMICOLON : ';';
VERT : '|';
COMMA : ',';