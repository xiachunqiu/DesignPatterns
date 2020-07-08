package patterns.creationalpatterns.builderpattern.packing;

import patterns.creationalpatterns.builderpattern.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
