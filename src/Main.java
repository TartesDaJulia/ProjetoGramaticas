import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class Main {

    public  static  void main (String[] args) throws IOException{

        ISNLexer lexer;
        boolean control=false;
        File file = new File("C:\\Users\\Henrique\\UMinho\\1Ano2019\\1Semestre\\PRI\\TPC\\PRI2019\\Projeto\\API\\fileToParse\\registers.txt");

        while(!control)
        {
            if(file.exists()){
                try {
                    lexer = new ISNLexer(CharStreams.fromFileName("C:\\Users\\Henrique\\UMinho\\1Ano2019\\1Semestre\\PRI\\TPC\\PRI2019\\Projeto\\API\\fileToParse\\registers.txt"));
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    ISNParser parser = new ISNParser(tokens);
                    ParserRuleContext ctx = parser.registers();
                    ISNCVVisitor visitor = new ISNCVVisitor();
                    visitor.visit(ctx);
                    try{
                        file.delete();
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            else{
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }




    }
}

