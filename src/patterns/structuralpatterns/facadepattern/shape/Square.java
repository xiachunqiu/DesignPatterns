package patterns.structuralpatterns.facadepattern.shape;

import patterns.structuralpatterns.facadepattern.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
