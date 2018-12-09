package factory.abstractfactory.ingredients.concrete;

import factory.abstractfactory.ingredients.interfaces.Cheese;


public class MozzarellaCheese implements Cheese {
    @Override
    public String getName() {
        return "Mozzarella Cheese";
    }
}
