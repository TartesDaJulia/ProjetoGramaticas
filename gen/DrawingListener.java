// Generated from C:/Users/Henrique/IdeaProjects/Teste2020/src\Drawing.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrawingParser}.
 */
public interface DrawingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DrawingParser#drawing}.
	 * @param ctx the parse tree
	 */
	void enterDrawing(DrawingParser.DrawingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawingParser#drawing}.
	 * @param ctx the parse tree
	 */
	void exitDrawing(DrawingParser.DrawingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawingParser#canvas}.
	 * @param ctx the parse tree
	 */
	void enterCanvas(DrawingParser.CanvasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawingParser#canvas}.
	 * @param ctx the parse tree
	 */
	void exitCanvas(DrawingParser.CanvasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawingParser#figures}.
	 * @param ctx the parse tree
	 */
	void enterFigures(DrawingParser.FiguresContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawingParser#figures}.
	 * @param ctx the parse tree
	 */
	void exitFigures(DrawingParser.FiguresContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawingParser#figure}.
	 * @param ctx the parse tree
	 */
	void enterFigure(DrawingParser.FigureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawingParser#figure}.
	 * @param ctx the parse tree
	 */
	void exitFigure(DrawingParser.FigureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawingParser#rectangle}.
	 * @param ctx the parse tree
	 */
	void enterRectangle(DrawingParser.RectangleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawingParser#rectangle}.
	 * @param ctx the parse tree
	 */
	void exitRectangle(DrawingParser.RectangleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawingParser#triangle}.
	 * @param ctx the parse tree
	 */
	void enterTriangle(DrawingParser.TriangleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawingParser#triangle}.
	 * @param ctx the parse tree
	 */
	void exitTriangle(DrawingParser.TriangleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawingParser#circle}.
	 * @param ctx the parse tree
	 */
	void enterCircle(DrawingParser.CircleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawingParser#circle}.
	 * @param ctx the parse tree
	 */
	void exitCircle(DrawingParser.CircleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawingParser#center}.
	 * @param ctx the parse tree
	 */
	void enterCenter(DrawingParser.CenterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawingParser#center}.
	 * @param ctx the parse tree
	 */
	void exitCenter(DrawingParser.CenterContext ctx);
}