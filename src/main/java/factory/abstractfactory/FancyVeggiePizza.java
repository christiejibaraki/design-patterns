package factory.abstractfactory;

import factory.abstractfactory.ingredients.PizzaIngredientFactory;
import factory.abstractfactory.ingredients.interfaces.Veggies;

public class FancyVeggiePizza extends FancyPizza {

    PizzaIngredientFactory ingredientFactory;

    public FancyVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();

        System.out.println("Tossing " + dough.getName());
        System.out.println("Adding " + sauce.getName());
        System.out.println("Adding Veggies");
        for(Veggies veg : veggies){
            System.out.println("    " + veg.getName());
        }
    }
}


