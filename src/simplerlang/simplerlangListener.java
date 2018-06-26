// Generated from ..\src\simplerlang\simplerlang.g4 by ANTLR 4.7.1
package simplerlang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simplerlangParser}.
 */
public interface simplerlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simplerlangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(simplerlangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplerlangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(simplerlangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplerlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(simplerlangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplerlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(simplerlangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplerlangParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(simplerlangParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplerlangParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(simplerlangParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplerlangParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(simplerlangParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplerlangParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(simplerlangParser.ShowContext ctx);
}