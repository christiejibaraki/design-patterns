package factory.abstractfactory;

import factory.abstractfactory.ingredients.ChicagoPizzaIngredientFactory;
import factory.abstractfactory.ingredients.PizzaIngredientFactory;

public class FancyChicagoPizzaStore extends FancyPizzaStore {

    @Override
    FancyPizza createPizza(String item) {
        FancyPizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new FancyCheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }else if(item.equals("veggie")){
            pizza = new FancyVeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }

        return pizza;
    }
}
