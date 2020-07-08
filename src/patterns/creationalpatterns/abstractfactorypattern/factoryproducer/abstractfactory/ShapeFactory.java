package patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory;

import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.AbstractFactory;
import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.colorfactory.Color;
import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.shapefactory.Circle;
import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.shapefactory.Rectangle;
import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.shapefactory.Shape;
import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.shapefactory.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
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

    @Override
    public Color getColor(String color) {
        return null;
    }
}
