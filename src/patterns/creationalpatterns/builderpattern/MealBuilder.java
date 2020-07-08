package patterns.creationalpatterns.builderpattern;

import patterns.creationalpatterns.builderpattern.item.burger.ChickenBurger;
import patterns.creationalpatterns.builderpattern.item.burger.VegBurger;
import patterns.creationalpatterns.builderpattern.item.colddrink.Coke;
import patterns.creationalpatterns.builderpattern.item.colddrink.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
