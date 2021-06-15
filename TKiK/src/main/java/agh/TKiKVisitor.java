// Generated from TKiK.g4 by ANTLR 4.9.2
package agh;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TKiKParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TKiKVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TKiKParser#entire_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntire_program(TKiKParser.Entire_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary(TKiKParser.LibraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing(TKiKParser.UsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(TKiKParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(TKiKParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(TKiKParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(TKiKParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#body_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_element(TKiKParser.Body_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(TKiKParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#double_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_operator(TKiKParser.Double_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#single_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_operator(TKiKParser.Single_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TKiKParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(TKiKParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(TKiKParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(TKiKParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(TKiKParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(TKiKParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TKiKParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TKiKParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TKiKParser.TypeContext ctx);
}