package factory.abstractfactory.ingredients;

import factory.abstractfactory.ingredients.concrete.DeepDishDough;
import factory.abstractfactory.ingredients.concrete.MozzarellaCheese;
import factory.abstractfactory.ingredients.concrete.PlumTomatoSauce;
import factory.abstractfactory.ingredients.concrete.VeggiesTho;
import factory.abstractfactory.ingredients.interfaces.Cheese;
import factory.abstractfactory.ingredients.interfaces.Dough;
import factory.abstractfactory.ingredients.interfaces.Sauce;
import factory.abstractfactory.ingredients.interfaces.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new DeepDishDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] vegArray = {new VeggiesTho()};
        return vegArray;
    }
}
