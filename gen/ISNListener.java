// Generated from C:/Users/Henrique/UMinho/1Ano2019/1Semestre/Gramaticas/ProjetoGramaticas/src\ISN.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ISNParser}.
 */
public interface ISNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ISNParser#registers}.
	 * @param ctx the parse tree
	 */
	void enterRegisters(ISNParser.RegistersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#registers}.
	 * @param ctx the parse tree
	 */
	void exitRegisters(ISNParser.RegistersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(ISNParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(ISNParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(ISNParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(ISNParser.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#info}.
	 * @param ctx the parse tree
	 */
	void enterInfo(ISNParser.InfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#info}.
	 * @param ctx the parse tree
	 */
	void exitInfo(ISNParser.InfoContext ctx);
}