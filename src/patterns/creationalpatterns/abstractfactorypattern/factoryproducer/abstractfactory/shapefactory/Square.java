package patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.shapefactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
