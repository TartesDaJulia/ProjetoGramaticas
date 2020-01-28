import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.util.Map;

public class Main {

    public  static  void main (String[] args) throws IOException{

        ISNLexer lexer;
        lexer = new ISNLexer(CharStreams.fromFileName("C:\\Users\\Henrique\\IdeaProjects\\ProjetoGramaticas\\testes\\1.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ISNParser parser = new ISNParser(tokens);
        ParserRuleContext ctx = parser.cv();

        ISNCVVisitor visitor = new ISNCVVisitor();
        visitor.visit(ctx);


    }
}

