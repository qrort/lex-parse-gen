// Generated from /home/qrort/hw/mt/lab3/src/grammar/GrammarGrammar.g4 by ANTLR 4.8
package grammar;

    import java.util.*;
    import templates.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammarGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#signs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigns(GrammarGrammarParser.SignsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(GrammarGrammarParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#funcs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncs(GrammarGrammarParser.FuncsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(GrammarGrammarParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#blanks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlanks(GrammarGrammarParser.BlanksContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#startS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartS(GrammarGrammarParser.StartSContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#attrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrs(GrammarGrammarParser.AttrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(GrammarGrammarParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#lexems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexems(GrammarGrammarParser.LexemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#nextLexem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextLexem(GrammarGrammarParser.NextLexemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(GrammarGrammarParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#nextRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextRule(GrammarGrammarParser.NextRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#ruleContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleContent(GrammarGrammarParser.RuleContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#ruleContentContinuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleContentContinuation(GrammarGrammarParser.RuleContentContinuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#ruleInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleInstance(GrammarGrammarParser.RuleInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#tokenSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenSequence(GrammarGrammarParser.TokenSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#tokenInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenInstance(GrammarGrammarParser.TokenInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#codeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeValue(GrammarGrammarParser.CodeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrValue(GrammarGrammarParser.AttrValueContext ctx);
}