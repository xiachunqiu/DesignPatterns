package patterns.creationalpatterns.prototypepattern.shape;

import patterns.creationalpatterns.prototypepattern.Shape;

public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
