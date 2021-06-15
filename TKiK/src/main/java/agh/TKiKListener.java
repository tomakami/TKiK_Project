// Generated from TKiK.g4 by ANTLR 4.9.2
package agh;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TKiKParser}.
 */
public interface TKiKListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TKiKParser#entire_program}.
	 * @param ctx the parse tree
	 */
	void enterEntire_program(TKiKParser.Entire_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#entire_program}.
	 * @param ctx the parse tree
	 */
	void exitEntire_program(TKiKParser.Entire_programContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#library}.
	 * @param ctx the parse tree
	 */
	void enterLibrary(TKiKParser.LibraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#library}.
	 * @param ctx the parse tree
	 */
	void exitLibrary(TKiKParser.LibraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#using}.
	 * @param ctx the parse tree
	 */
	void enterUsing(TKiKParser.UsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#using}.
	 * @param ctx the parse tree
	 */
	void exitUsing(TKiKParser.UsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(TKiKParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(TKiKParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(TKiKParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(TKiKParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(TKiKParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(TKiKParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(TKiKParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(TKiKParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#body_element}.
	 * @param ctx the parse tree
	 */
	void enterBody_element(TKiKParser.Body_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#body_element}.
	 * @param ctx the parse tree
	 */
	void exitBody_element(TKiKParser.Body_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(TKiKParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(TKiKParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#double_operator}.
	 * @param ctx the parse tree
	 */
	void enterDouble_operator(TKiKParser.Double_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#double_operator}.
	 * @param ctx the parse tree
	 */
	void exitDouble_operator(TKiKParser.Double_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#single_operator}.
	 * @param ctx the parse tree
	 */
	void enterSingle_operator(TKiKParser.Single_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#single_operator}.
	 * @param ctx the parse tree
	 */
	void exitSingle_operator(TKiKParser.Single_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TKiKParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TKiKParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(TKiKParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(TKiKParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(TKiKParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(TKiKParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(TKiKParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(TKiKParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(TKiKParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(TKiKParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(TKiKParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(TKiKParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TKiKParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TKiKParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TKiKParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TKiKParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKiKParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TKiKParser.TypeContext ctx);
}