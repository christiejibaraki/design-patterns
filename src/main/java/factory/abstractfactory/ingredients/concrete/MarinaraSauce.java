package factory.abstractfactory.ingredients.concrete;

import factory.abstractfactory.ingredients.interfaces.Sauce;

public class MarinaraSauce implements Sauce {
    @Override
    public String getName() {
        return "Marinara Sauce";
    }
}
