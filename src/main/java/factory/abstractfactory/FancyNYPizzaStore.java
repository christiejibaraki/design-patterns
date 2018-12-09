package factory.abstractfactory;

import factory.abstractfactory.ingredients.NYPizzaIngredientFactory;
import factory.abstractfactory.ingredients.PizzaIngredientFactory;

public class FancyNYPizzaStore extends FancyPizzaStore {

    @Override
    FancyPizza createPizza(String item) {

        FancyPizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new FancyCheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if(item.equals("veggie")){
            pizza = new FancyVeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veg Pizza");
        }

        return pizza;
    }
}
