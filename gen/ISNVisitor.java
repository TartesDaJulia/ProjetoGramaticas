// Generated from C:/Users/Henrique/IdeaProjects/ProjetoGramaticas/src\ISN.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link ISNParser#cv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCv(ISNParser.CvContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(ISNParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#personal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersonal(ISNParser.PersonalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#projects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjects(ISNParser.ProjectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#networks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetworks(ISNParser.NetworksContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#editorialBoards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEditorialBoards(ISNParser.EditorialBoardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#scientificCommittee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientificCommittee(ISNParser.ScientificCommitteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#otherInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherInfo(ISNParser.OtherInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#thesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThesis(ISNParser.ThesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#organizationOfEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrganizationOfEvents(ISNParser.OrganizationOfEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#scientificMeetings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientificMeetings(ISNParser.ScientificMeetingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#publications}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublications(ISNParser.PublicationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#listFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListFormat(ISNParser.ListFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(ISNParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear(ISNParser.YearContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(ISNParser.MonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link ISNParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(ISNParser.DayContext ctx);
}