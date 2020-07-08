package patterns.structuralpatterns.decoratorpattern.shape;

import patterns.structuralpatterns.decoratorpattern.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
