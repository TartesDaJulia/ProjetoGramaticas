import java.util.*;

public class ISNCVVisitor extends  ISNBaseVisitor{

    @Override
    public Object visitCv(ISNParser.CvContext ctx) {
        return super.visitCv(ctx);
    }

    @Override
    public Object visitTable(ISNParser.TableContext ctx) {
        return super.visitTable(ctx);
    }

    @Override
    public Object visitPersonal(ISNParser.PersonalContext ctx) {
        return super.visitPersonal(ctx);
    }

    @Override
    public Object visitProjects(ISNParser.ProjectsContext ctx) {
        return super.visitProjects(ctx);
    }

    @Override
    public Object visitNetworks(ISNParser.NetworksContext ctx) {
        return super.visitNetworks(ctx);
    }

    @Override
    public Object visitEditorialBoards(ISNParser.EditorialBoardsContext ctx) {
        return super.visitEditorialBoards(ctx);
    }

    @Override
    public Object visitScientificCommittee(ISNParser.ScientificCommitteeContext ctx) {
        return super.visitScientificCommittee(ctx);
    }

    @Override
    public Object visitOtherInfo(ISNParser.OtherInfoContext ctx) {
        return super.visitOtherInfo(ctx);
    }

    @Override
    public Object visitThesis(ISNParser.ThesisContext ctx) {
        return super.visitThesis(ctx);
    }

    @Override
    public Object visitOrganizationOfEvents(ISNParser.OrganizationOfEventsContext ctx) {
        return super.visitOrganizationOfEvents(ctx);
    }

    @Override
    public Object visitScientificMeetings(ISNParser.ScientificMeetingsContext ctx) {
        return super.visitScientificMeetings(ctx);
    }

    @Override
    public Object visitPublications(ISNParser.PublicationsContext ctx) {
        return super.visitPublications(ctx);
    }

    @Override
    public Object visitListFormat(ISNParser.ListFormatContext ctx) {
        return super.visitListFormat(ctx);
    }

    @Override
    public Object visitDate(ISNParser.DateContext ctx) {
        return super.visitDate(ctx);
    }

    @Override
    public Object visitYear(ISNParser.YearContext ctx) {
        return super.visitYear(ctx);
    }

    @Override
    public Object visitMonth(ISNParser.MonthContext ctx) {
        return super.visitMonth(ctx);
    }

    @Override
    public Object visitDay(ISNParser.DayContext ctx) {
        return super.visitDay(ctx);
    }
}
