package patterns.creationalpatterns.abstractfactorypattern.factoryproducer;

import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.colorfactory.Color;
import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.shapefactory.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
