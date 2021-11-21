// Generated from /home/qrort/hw/mt/lab3/src/grammar/GrammarGrammar.g4 by ANTLR 4.8
package grammar;

    import java.util.*;
    import templates.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarGrammarParser}.
 */
public interface GrammarGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#signs}.
	 * @param ctx the parse tree
	 */
	void enterSigns(GrammarGrammarParser.SignsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#signs}.
	 * @param ctx the parse tree
	 */
	void exitSigns(GrammarGrammarParser.SignsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(GrammarGrammarParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(GrammarGrammarParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#funcs}.
	 * @param ctx the parse tree
	 */
	void enterFuncs(GrammarGrammarParser.FuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#funcs}.
	 * @param ctx the parse tree
	 */
	void exitFuncs(GrammarGrammarParser.FuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GrammarGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GrammarGrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#blanks}.
	 * @param ctx the parse tree
	 */
	void enterBlanks(GrammarGrammarParser.BlanksContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#blanks}.
	 * @param ctx the parse tree
	 */
	void exitBlanks(GrammarGrammarParser.BlanksContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#startS}.
	 * @param ctx the parse tree
	 */
	void enterStartS(GrammarGrammarParser.StartSContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#startS}.
	 * @param ctx the parse tree
	 */
	void exitStartS(GrammarGrammarParser.StartSContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#attrs}.
	 * @param ctx the parse tree
	 */
	void enterAttrs(GrammarGrammarParser.AttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#attrs}.
	 * @param ctx the parse tree
	 */
	void exitAttrs(GrammarGrammarParser.AttrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(GrammarGrammarParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(GrammarGrammarParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#lexems}.
	 * @param ctx the parse tree
	 */
	void enterLexems(GrammarGrammarParser.LexemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#lexems}.
	 * @param ctx the parse tree
	 */
	void exitLexems(GrammarGrammarParser.LexemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#nextLexem}.
	 * @param ctx the parse tree
	 */
	void enterNextLexem(GrammarGrammarParser.NextLexemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#nextLexem}.
	 * @param ctx the parse tree
	 */
	void exitNextLexem(GrammarGrammarParser.NextLexemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(GrammarGrammarParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(GrammarGrammarParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#nextRule}.
	 * @param ctx the parse tree
	 */
	void enterNextRule(GrammarGrammarParser.NextRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#nextRule}.
	 * @param ctx the parse tree
	 */
	void exitNextRule(GrammarGrammarParser.NextRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#ruleContent}.
	 * @param ctx the parse tree
	 */
	void enterRuleContent(GrammarGrammarParser.RuleContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#ruleContent}.
	 * @param ctx the parse tree
	 */
	void exitRuleContent(GrammarGrammarParser.RuleContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#ruleContentContinuation}.
	 * @param ctx the parse tree
	 */
	void enterRuleContentContinuation(GrammarGrammarParser.RuleContentContinuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#ruleContentContinuation}.
	 * @param ctx the parse tree
	 */
	void exitRuleContentContinuation(GrammarGrammarParser.RuleContentContinuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#ruleInstance}.
	 * @param ctx the parse tree
	 */
	void enterRuleInstance(GrammarGrammarParser.RuleInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#ruleInstance}.
	 * @param ctx the parse tree
	 */
	void exitRuleInstance(GrammarGrammarParser.RuleInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#tokenSequence}.
	 * @param ctx the parse tree
	 */
	void enterTokenSequence(GrammarGrammarParser.TokenSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#tokenSequence}.
	 * @param ctx the parse tree
	 */
	void exitTokenSequence(GrammarGrammarParser.TokenSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#tokenInstance}.
	 * @param ctx the parse tree
	 */
	void enterTokenInstance(GrammarGrammarParser.TokenInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#tokenInstance}.
	 * @param ctx the parse tree
	 */
	void exitTokenInstance(GrammarGrammarParser.TokenInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#codeValue}.
	 * @param ctx the parse tree
	 */
	void enterCodeValue(GrammarGrammarParser.CodeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#codeValue}.
	 * @param ctx the parse tree
	 */
	void exitCodeValue(GrammarGrammarParser.CodeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrValue(GrammarGrammarParser.AttrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrValue(GrammarGrammarParser.AttrValueContext ctx);
}