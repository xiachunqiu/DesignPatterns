package patterns.structuralpatterns.bridgepattern.shape;

import patterns.structuralpatterns.bridgepattern.DrawAPI;
import patterns.structuralpatterns.bridgepattern.Shape;

public class Circle extends Shape {
    private final int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
