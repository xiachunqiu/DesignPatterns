package patterns.structuralpatterns.bridgepattern.shape;

import patterns.structuralpatterns.bridgepattern.DrawAPI;
import patterns.structuralpatterns.bridgepattern.Shape;

public class Square extends Shape {
    private final int x, y, sides;

    public Square(int x, int y, int sides, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.sides = sides;
    }

    @Override
    public void draw() {
        drawAPI.drawSquare(sides, x, y);
    }
}
