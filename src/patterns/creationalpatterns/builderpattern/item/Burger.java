package patterns.creationalpatterns.builderpattern.item;

import patterns.creationalpatterns.builderpattern.Item;
import patterns.creationalpatterns.builderpattern.Packing;
import patterns.creationalpatterns.builderpattern.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
