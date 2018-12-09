package factory.abstractfactory.ingredients.concrete;

import factory.abstractfactory.ingredients.interfaces.Dough;

public class ThinCrustDough implements Dough {
    @Override
    public String getName() {
        return "Thin Crust Dough";
    }
}
