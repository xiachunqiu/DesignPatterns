package patterns.structuralpatterns.decoratorpattern.decorator;

import patterns.structuralpatterns.decoratorpattern.Shape;
import patterns.structuralpatterns.decoratorpattern.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
