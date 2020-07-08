package patterns.structuralpatterns.facadepattern.shape;

import patterns.structuralpatterns.facadepattern.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
