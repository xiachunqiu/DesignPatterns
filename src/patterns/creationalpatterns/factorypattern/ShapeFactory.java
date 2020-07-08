package patterns.creationalpatterns.factorypattern;

import patterns.creationalpatterns.factorypattern.shapefactory.Circle;
import patterns.creationalpatterns.factorypattern.shapefactory.Rectangle;
import patterns.creationalpatterns.factorypattern.shapefactory.Shape;
import patterns.creationalpatterns.factorypattern.shapefactory.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
