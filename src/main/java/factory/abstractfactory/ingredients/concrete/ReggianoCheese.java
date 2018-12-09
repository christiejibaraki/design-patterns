package factory.abstractfactory.ingredients.concrete;

import factory.abstractfactory.ingredients.interfaces.Cheese;

public class ReggianoCheese implements Cheese {
    @Override
    public String getName() {
        return "Reggiano Cheese";
    }
}
