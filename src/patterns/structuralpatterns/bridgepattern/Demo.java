package patterns.structuralpatterns.bridgepattern;

import patterns.structuralpatterns.bridgepattern.bridgeshape.GreenCircle;
import patterns.structuralpatterns.bridgepattern.bridgeshape.GreenSquare;
import patterns.structuralpatterns.bridgepattern.bridgeshape.RedCircle;
import patterns.structuralpatterns.bridgepattern.bridgeshape.RedSquare;
import patterns.structuralpatterns.bridgepattern.shape.Circle;
import patterns.structuralpatterns.bridgepattern.shape.Square;

/**
 * 桥接模式
 */
public class Demo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();

        Shape redSquare = new Square(100, 100, 20, new RedSquare());
        Shape greenSquare = new Square(100, 100, 20, new GreenSquare());
        redSquare.draw();
        greenSquare.draw();
    }
}
