package patterns.creationalpatterns.builderpattern;

public interface Item {
    String name();

    Packing packing();

    float price();
}
