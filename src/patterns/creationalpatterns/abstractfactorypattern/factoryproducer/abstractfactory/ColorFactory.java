package patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory;

import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.AbstractFactory;
import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.colorfactory.Blue;
import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.colorfactory.Color;
import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.colorfactory.Green;
import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.colorfactory.Red;
import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.shapefactory.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
