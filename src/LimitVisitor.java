import java.util.*;

public class LimitVisitor extends DrawingBaseVisitor<int[]> {

    //a)verificar se desenho se encontra dentro dos limites
    //guardar limites de uma figura + centro e calcular usando limites do canvas
    
    public int[] canvasSize = new int[]{0,0};
    public int[] center = new int[]{0,0};
    public int[] figureSize = new int[]{0,0};
    public int figureType = 0;
    // 1 = rectangle || triangle
    // 2 = circle
    
    
    //b)calcular centro gravitacional do desenho-> (X,Y) onde X e Y sao a media dos centros das figuras
    public float centroX= 0;
    public float centroY=0;
    public float centroN=0;
    
    public LimitVisitor() {

    }

    @Override
    public int[] visitDrawing(DrawingParser.DrawingContext ctx) {
        System.out.println("Visitei o desenho");
        if(ctx.canvas()!= null){
            System.out.println("Visitei o desenho e passo para o canvas");
            visit(ctx.canvas());
        }
        if(ctx.figures()!= null){
            System.out.println("Visitei o desenho e passo para as figuras");
            visit(ctx.figures());
        }

        System.out.println("Centro gravitacional = ("+ centroX/centroN + "," +centroY/centroN+")");
        return null;
    }

    @Override
    public int[] visitCanvas(DrawingParser.CanvasContext ctx)
    {
        System.out.println("Visitei o canvas");
        canvasSize[0]= Integer.parseInt(ctx.INT().get(0).toString());
        canvasSize[1]= Integer.parseInt(ctx.INT().get(1).toString());

        return null;
    }

    @Override
    public int[] visitFigures(DrawingParser.FiguresContext ctx) {
        System.out.println("Visitei as figuras");
        for (DrawingParser.FigureContext fig : ctx.figure()       ) {
            visit(fig);
            centroN++;
        }
        return null;
    }

    @Override
    public int[] visitFigure(DrawingParser.FigureContext ctx) {
        System.out.println("Visitei a figura");
        if(ctx.circle()!=null){
            visit(ctx.circle());
        }
        if(ctx.triangle()!=null){
            visit(ctx.triangle());
        }
        if(ctx.rectangle()!=null){
            visit(ctx.rectangle());
        }
        return null;
    }

    @Override
    public int[] visitRectangle(DrawingParser.RectangleContext ctx) {
        System.out.println("Visitei o rectangulo");
        figureSize[0]=Integer.parseInt(ctx.INT().get(0).toString());
        figureSize[1]=Integer.parseInt(ctx.INT().get(1).toString());
        figureType=1;
        if(ctx.center()!=null){
        visit(ctx.center());}
        return null;
    }

    @Override
    public int[] visitTriangle(DrawingParser.TriangleContext ctx) {
        System.out.println("Visitei o triangulo");
        figureSize[0]=Integer.parseInt(ctx.INT().get(0).toString());
        figureSize[1]=Integer.parseInt(ctx.INT().get(1).toString());
        figureType=1;
        if(ctx.center()!=null){
            visit(ctx.center());}
        return null;
    }

    @Override
    public int[] visitCircle(DrawingParser.CircleContext ctx) {
        System.out.println("Visitei o circulo");
        figureSize[0]=Integer.parseInt(ctx.INT().toString());
        figureSize[1]=0;
        figureType=2;
        if(ctx.center()!=null){
            visit(ctx.center());}
        return null;
    }

    @Override
    public int[] visitCenter(DrawingParser.CenterContext ctx) {
        System.out.println("Visitei o centro");
        center[0]=Integer.parseInt(ctx.INT().get(0).toString());
        center[1]=Integer.parseInt(ctx.INT().get(1).toString());
        centroX+=center[0];
        centroY+=center[1];
        System.out.println("Vou verificar os desenhos");
        boolean notErro = true;
        System.out.println("Figura tipo: "+figureType);
        if(figureType==1 && ( (center[0]+figureSize[0]/2 > canvasSize[0] ) || (center[0]-figureSize[0]/2 <0 ) || (center[1]+figureSize[1]/2 > canvasSize[1] ) || (center[1]-figureSize[1]/2 < 0 )))
        {
             System.out.println("Erro, desenho ultrapassa os limites!");
             notErro=false;
        }
        else if(figureType==2 && ((center[0]+figureSize[0]/2 > canvasSize[0]) || (center[0]-figureSize[0]/2 < 0) || (center[1]+figureSize[0]/2 > canvasSize[1]) || (center[1]+figureSize[0]/2 < 0)))
        {
            System.out.println("Erro, desenho ultrapassa os limites!");
            notErro=false;
        }
        if(notErro){
            System.out.println("Figura bem desenhada");
        }
        return null;
    }
}