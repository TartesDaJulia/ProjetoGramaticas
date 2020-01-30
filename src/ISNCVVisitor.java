import java.util.*;
public class ISNCVVisitor extends  ISNBaseVisitor<String>{

    public List<String> data = new ArrayList<String>();
    public List< List<String> >registers = new ArrayList< List<String>>();


    public ISNCVVisitor() {
    }

    @Override
    public String visitRegisters(ISNParser.RegistersContext ctx) {
        for(ISNParser.RegisterContext reg: ctx.register())
        {
            visit(reg);
        }
        System.out.println("Vou imprimir a lista conseguida...\n");
        for (int i = 0; i < registers.size(); i++) {
            System.out.println(registers.get(i));
        }
        return null;
    }

    @Override
    public String visitRegister(ISNParser.RegisterContext ctx) {
        if(ctx.user()!=null)
        {
            visit(ctx.user());
        }
        return null;
    }

    @Override
    public String visitUser(ISNParser.UserContext ctx) {
        String temp = "";
        for (ISNParser.InfoContext inf: ctx.info()) {
            data.add(visit(inf));
        }
        registers.add(new ArrayList<String>(data));
        data.clear();
        return null;
    }

    @Override
    public String visitInfo(ISNParser.InfoContext ctx) {
        return ctx.getText();
    }
}
