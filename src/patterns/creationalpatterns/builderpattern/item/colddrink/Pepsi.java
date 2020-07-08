package patterns.creationalpatterns.builderpattern.item.colddrink;

import patterns.creationalpatterns.builderpattern.item.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
