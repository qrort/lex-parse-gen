import generated.*;
import grammar.GrammarGrammarLexer;
import grammar.GrammarGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import templates.GrammarHolder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import templates.LexException;
import templates.ParseException;
import templates.Tree;

public class Main {
    public static void main(String[] args) throws IOException, LexException, ParseException {

        GrammarGrammarLexer lexer = new GrammarGrammarLexer(CharStreams.fromFileName("calculator.txt", StandardCharsets.UTF_8));
        GrammarGrammarParser parser = new GrammarGrammarParser(new CommonTokenStream(lexer));
        GrammarHolder holder = parser.start().val;
        System.out.println(holder.getName());
        holder.generateLexer();
        holder.generateParser();
        //holder.printSets();
        calculatorGrammarParser parser1 = new calculatorGrammarParser(new calculatorGrammarLexer("calculator_sample.txt"));
        calculatorGrammarTree root = parser1.parse();
        System.out.println(root.value0);
        //exampleGrammarParser parser1 = new exampleGrammarParser(new exampleGrammarLexer("calculator_sample.txt"));
        //exampleGrammarTree root = parser1.parse();
    }
}
