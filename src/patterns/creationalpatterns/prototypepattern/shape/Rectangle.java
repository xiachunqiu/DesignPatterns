package patterns.creationalpatterns.prototypepattern.shape;

import patterns.creationalpatterns.prototypepattern.Shape;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
