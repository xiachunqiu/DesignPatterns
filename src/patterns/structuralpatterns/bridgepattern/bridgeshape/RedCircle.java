package patterns.structuralpatterns.bridgepattern.bridgeshape;

import patterns.structuralpatterns.bridgepattern.DrawAPI;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }

    @Override
    public void drawSquare(int sides, int x, int y) {
    }
}
