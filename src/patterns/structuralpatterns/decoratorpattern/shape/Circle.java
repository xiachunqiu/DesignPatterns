package patterns.structuralpatterns.decoratorpattern.shape;

import patterns.structuralpatterns.decoratorpattern.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
