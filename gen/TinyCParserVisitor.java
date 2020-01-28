// Generated from C:/Users/Henrique/IdeaProjects/TinyC/src\Inquerito.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TinyCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TinyCParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TinyCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TinyCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TinyCParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyCParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(TinyCParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyCParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(TinyCParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyCParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(TinyCParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyCParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(TinyCParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(TinyCParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElseStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(TinyCParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(TinyCParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStmt(TinyCParser.DoWhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracedStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedStmt(TinyCParser.BracedStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(TinyCParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(TinyCParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(TinyCParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyCParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(TinyCParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyCParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(TinyCParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyCParser#paren_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_expr(TinyCParser.Paren_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TinyCParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyCParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(TinyCParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyCParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(TinyCParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(TinyCParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyCParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TinyCParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyCParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(TinyCParser.IntegerContext ctx);
}