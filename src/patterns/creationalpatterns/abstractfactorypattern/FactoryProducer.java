package patterns.creationalpatterns.abstractfactorypattern;

import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.AbstractFactory;
import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.ColorFactory;
import patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice == null) {
            return null;
        }
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
