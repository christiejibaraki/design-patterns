package factory.abstractfactory.ingredients;

import factory.abstractfactory.ingredients.interfaces.*;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();

}
