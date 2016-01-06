// Generated from C:/Git/Calculator/src/main/antlr4/com/synopsys/homework\CalcGrammar.g4 by ANTLR 4.5.1
package com.synopsys.homework.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcGrammarParser}.
 */
public interface CalcGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(CalcGrammarParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(CalcGrammarParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalcGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalcGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(CalcGrammarParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(CalcGrammarParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#sub_expr}.
	 * @param ctx the parse tree
	 */
	void enterSub_expr(CalcGrammarParser.Sub_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#sub_expr}.
	 * @param ctx the parse tree
	 */
	void exitSub_expr(CalcGrammarParser.Sub_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void enterMult_expr(CalcGrammarParser.Mult_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void exitMult_expr(CalcGrammarParser.Mult_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#div_expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv_expr(CalcGrammarParser.Div_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#div_expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv_expr(CalcGrammarParser.Div_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#let_expr}.
	 * @param ctx the parse tree
	 */
	void enterLet_expr(CalcGrammarParser.Let_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#let_expr}.
	 * @param ctx the parse tree
	 */
	void exitLet_expr(CalcGrammarParser.Let_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#expr_or_num}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or_num(CalcGrammarParser.Expr_or_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#expr_or_num}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or_num(CalcGrammarParser.Expr_or_numContext ctx);
}