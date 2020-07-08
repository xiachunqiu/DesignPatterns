package patterns.creationalpatterns.builderpattern.packing;

import patterns.creationalpatterns.builderpattern.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
