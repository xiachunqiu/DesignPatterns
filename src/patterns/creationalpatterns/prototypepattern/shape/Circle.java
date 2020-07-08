package patterns.creationalpatterns.prototypepattern.shape;

import patterns.creationalpatterns.prototypepattern.Shape;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
