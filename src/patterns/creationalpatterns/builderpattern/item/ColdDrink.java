package patterns.creationalpatterns.builderpattern.item;

import patterns.creationalpatterns.builderpattern.Item;
import patterns.creationalpatterns.builderpattern.Packing;
import patterns.creationalpatterns.builderpattern.packing.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
