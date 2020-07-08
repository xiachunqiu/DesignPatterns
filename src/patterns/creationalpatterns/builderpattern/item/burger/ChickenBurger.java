package patterns.creationalpatterns.builderpattern.item.burger;

import patterns.creationalpatterns.builderpattern.item.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
