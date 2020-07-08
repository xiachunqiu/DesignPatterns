package patterns.structuralpatterns.bridgepattern.bridgeshape;

import patterns.structuralpatterns.bridgepattern.DrawAPI;

public class GreenSquare implements DrawAPI {
    @Override
    public void drawCircle(int sides, int x, int y) {
    }

    @Override
    public void drawSquare(int sides, int x, int y) {
        System.out.println("Drawing Square[ color: green, sides: " + sides + ", x: " + x + ", " + y + "]");
    }
}
