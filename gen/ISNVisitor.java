// Generated from C:/Users/Henrique/UMinho/1Ano2019/1Semestre/Gramaticas/ProjetoGramaticas/src\ISN.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ISNParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ISNVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ISNParser#registers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegisters(ISNParser.RegistersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(ISNParser.RegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser(ISNParser.UserContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfo(ISNParser.InfoContext ctx);
}