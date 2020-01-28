// Generated from C:/Users/Henrique/IdeaProjects/ProjetoGramaticas/src\ISN.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ISNParser}.
 */
public interface ISNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ISNParser#cv}.
	 * @param ctx the parse tree
	 */
	void enterCv(ISNParser.CvContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#cv}.
	 * @param ctx the parse tree
	 */
	void exitCv(ISNParser.CvContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(ISNParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(ISNParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#personal}.
	 * @param ctx the parse tree
	 */
	void enterPersonal(ISNParser.PersonalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#personal}.
	 * @param ctx the parse tree
	 */
	void exitPersonal(ISNParser.PersonalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#projects}.
	 * @param ctx the parse tree
	 */
	void enterProjects(ISNParser.ProjectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#projects}.
	 * @param ctx the parse tree
	 */
	void exitProjects(ISNParser.ProjectsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#networks}.
	 * @param ctx the parse tree
	 */
	void enterNetworks(ISNParser.NetworksContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#networks}.
	 * @param ctx the parse tree
	 */
	void exitNetworks(ISNParser.NetworksContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#editorialBoards}.
	 * @param ctx the parse tree
	 */
	void enterEditorialBoards(ISNParser.EditorialBoardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#editorialBoards}.
	 * @param ctx the parse tree
	 */
	void exitEditorialBoards(ISNParser.EditorialBoardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#scientificCommittee}.
	 * @param ctx the parse tree
	 */
	void enterScientificCommittee(ISNParser.ScientificCommitteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#scientificCommittee}.
	 * @param ctx the parse tree
	 */
	void exitScientificCommittee(ISNParser.ScientificCommitteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#otherInfo}.
	 * @param ctx the parse tree
	 */
	void enterOtherInfo(ISNParser.OtherInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#otherInfo}.
	 * @param ctx the parse tree
	 */
	void exitOtherInfo(ISNParser.OtherInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#thesis}.
	 * @param ctx the parse tree
	 */
	void enterThesis(ISNParser.ThesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#thesis}.
	 * @param ctx the parse tree
	 */
	void exitThesis(ISNParser.ThesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#organizationOfEvents}.
	 * @param ctx the parse tree
	 */
	void enterOrganizationOfEvents(ISNParser.OrganizationOfEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#organizationOfEvents}.
	 * @param ctx the parse tree
	 */
	void exitOrganizationOfEvents(ISNParser.OrganizationOfEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#scientificMeetings}.
	 * @param ctx the parse tree
	 */
	void enterScientificMeetings(ISNParser.ScientificMeetingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#scientificMeetings}.
	 * @param ctx the parse tree
	 */
	void exitScientificMeetings(ISNParser.ScientificMeetingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#publications}.
	 * @param ctx the parse tree
	 */
	void enterPublications(ISNParser.PublicationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#publications}.
	 * @param ctx the parse tree
	 */
	void exitPublications(ISNParser.PublicationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#listFormat}.
	 * @param ctx the parse tree
	 */
	void enterListFormat(ISNParser.ListFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#listFormat}.
	 * @param ctx the parse tree
	 */
	void exitListFormat(ISNParser.ListFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(ISNParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(ISNParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(ISNParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(ISNParser.YearContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(ISNParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(ISNParser.MonthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ISNParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(ISNParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISNParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(ISNParser.DayContext ctx);
}