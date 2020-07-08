package patterns.creationalpatterns.abstractfactorypattern.factoryproducer.abstractfactory.colorfactory;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
