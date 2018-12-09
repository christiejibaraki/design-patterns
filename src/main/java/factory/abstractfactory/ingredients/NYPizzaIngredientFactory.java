package factory.abstractfactory.ingredients;

import factory.abstractfactory.ingredients.concrete.MarinaraSauce;
import factory.abstractfactory.ingredients.concrete.ReggianoCheese;
import factory.abstractfactory.ingredients.concrete.ThinCrustDough;
import factory.abstractfactory.ingredients.concrete.VeggiesTho;
import factory.abstractfactory.ingredients.interfaces.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] vegArray = {new VeggiesTho()};
        return vegArray;
    }

}
