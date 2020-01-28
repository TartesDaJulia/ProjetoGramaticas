// Generated from C:/Users/Henrique/IdeaProjects/Teste2020/src\Drawing.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DrawingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DrawingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DrawingParser#drawing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawing(DrawingParser.DrawingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawingParser#canvas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanvas(DrawingParser.CanvasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawingParser#figures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigures(DrawingParser.FiguresContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawingParser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigure(DrawingParser.FigureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawingParser#rectangle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRectangle(DrawingParser.RectangleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawingParser#triangle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriangle(DrawingParser.TriangleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawingParser#circle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircle(DrawingParser.CircleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawingParser#center}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenter(DrawingParser.CenterContext ctx);
}