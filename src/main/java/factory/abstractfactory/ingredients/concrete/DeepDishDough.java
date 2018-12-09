package factory.abstractfactory.ingredients.concrete;

import factory.abstractfactory.ingredients.interfaces.Dough;

public class DeepDishDough implements Dough {
    @Override
    public String getName() {
        return "Deep Dish Dough";
    }
}
