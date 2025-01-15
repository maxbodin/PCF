// Generated from /Users/maximebodin/Developer/IMT/PCF/PCF/src/parser/PCF.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PCFParser}.
 */
public interface PCFListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PCFParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PCFParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCFParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PCFParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condi}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterCondi(PCFParser.CondiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condi}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitCondi(PCFParser.CondiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterAdd(PCFParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitAdd(PCFParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCFParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(PCFParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCFParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(PCFParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCFParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(PCFParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCFParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(PCFParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCFParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(PCFParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCFParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(PCFParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link PCFParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterLit(PCFParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link PCFParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitLit(PCFParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link PCFParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParens(PCFParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link PCFParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParens(PCFParser.ParensContext ctx);
}