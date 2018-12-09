package factory.abstractfactory.ingredients.concrete;

import factory.abstractfactory.ingredients.interfaces.Sauce;

public class PlumTomatoSauce implements Sauce {
    @Override
    public String getName() {
        return "Plum Tomato Sauce";
    }
}
