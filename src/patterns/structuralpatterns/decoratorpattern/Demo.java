package patterns.structuralpatterns.decoratorpattern;

import patterns.structuralpatterns.decoratorpattern.decorator.RedShapeDecorator;
import patterns.structuralpatterns.decoratorpattern.shape.Circle;
import patterns.structuralpatterns.decoratorpattern.shape.Rectangle;

/**
 * 装饰器模式
 */
public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
