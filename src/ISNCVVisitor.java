import sun.reflect.annotation.ExceptionProxy;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class ISNCVVisitor extends  ISNBaseVisitor<String>{

    public List<String> data = new ArrayList<String>();
    public List< List<String> >registers = new ArrayList< List<String>>();
    public StringBuilder parsed = new StringBuilder();

    public ISNCVVisitor() {

    }

    @Override
    public String visitRegisters(ISNParser.RegistersContext ctx) {
        for(ISNParser.RegisterContext reg: ctx.register())
        {
            visit(reg);
        }
        System.out.println("Vou imprimir a lista conseguida...");
        parsed.append("{ \"registers\": [ ");
        for (int i = 0; i < registers.size(); i++) {
            System.out.println(registers.get(i));
            parsed.append(" { \"name\" :  "          + registers.get(i).get(0) +"," +
                            "\"username\" : "       + registers.get(i).get(1) +"," +
                            "\"mail\" : "           + registers.get(i).get(2) +"," +
                            "\"dateOfBirth\" : \""  + registers.get(i).get(3) +"\"," +
                            "\"password\" : "       + registers.get(i).get(4) +"," +
                            "\"course\" : "         + registers.get(i).get(5) +"," +
                            "\"type\" : "           + registers.get(i).get(6) +" }"
                    );
            if(i!=registers.size()-1){
                parsed.append(",");
            }
            else {
                parsed.append("]}");
            }
        }
        try {
            File file = new File("C:\\Users\\Henrique\\UMinho\\1Ano2019\\1Semestre\\PRI\\TPC\\PRI2019\\Projeto\\API\\parsedFile\\registers.json");
            if(file.createNewFile()){
                try{
                    FileWriter write = new FileWriter("C:\\Users\\Henrique\\UMinho\\1Ano2019\\1Semestre\\PRI\\TPC\\PRI2019\\Projeto\\API\\parsedFile\\registers.json");
                    write.append(parsed);
                    write.close();
                }catch(Exception e) {
                    System.out.println(e);
                }
            }
        }catch (Exception e){
            System.out.println(e);
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
