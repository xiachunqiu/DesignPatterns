package patterns.structuralpatterns.facadepattern;

import patterns.structuralpatterns.facadepattern.shape.Circle;
import patterns.structuralpatterns.facadepattern.shape.Rectangle;
import patterns.structuralpatterns.facadepattern.shape.Square;

public class ShapeMaker {
    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
