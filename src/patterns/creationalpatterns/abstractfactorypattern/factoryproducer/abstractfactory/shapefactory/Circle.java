package patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.shapefactory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
