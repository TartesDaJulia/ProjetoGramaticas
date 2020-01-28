// Generated from C:/Users/Henrique/IdeaProjects/TinyC/src\Inquerito.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TinyCParser}.
 */
public interface TinyCParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TinyCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TinyCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TinyCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TinyCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TinyCParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(TinyCParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(TinyCParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(TinyCParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(TinyCParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(TinyCParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(TinyCParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(TinyCParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(TinyCParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(TinyCParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(TinyCParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmt(TinyCParser.IfElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmt(TinyCParser.IfElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(TinyCParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(TinyCParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStmt(TinyCParser.DoWhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStmt(TinyCParser.DoWhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracedStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBracedStmt(TinyCParser.BracedStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracedStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBracedStmt(TinyCParser.BracedStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(TinyCParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(TinyCParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(TinyCParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(TinyCParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(TinyCParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(TinyCParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(TinyCParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(TinyCParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(TinyCParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(TinyCParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#paren_expr}.
	 * @param ctx the parse tree
	 */
	void enterParen_expr(TinyCParser.Paren_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#paren_expr}.
	 * @param ctx the parse tree
	 */
	void exitParen_expr(TinyCParser.Paren_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TinyCParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TinyCParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(TinyCParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(TinyCParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(TinyCParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(TinyCParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(TinyCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(TinyCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(TinyCParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(TinyCParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(TinyCParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(TinyCParser.IntegerContext ctx);
}