package factory.abstractfactory;

import factory.abstractfactory.ingredients.PizzaIngredientFactory;

public class FancyCheesePizza extends FancyPizza {

    PizzaIngredientFactory ingredientFactory;

    public FancyCheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        System.out.println("Tossing " + dough.getName());
        System.out.println("Adding " + sauce.getName());
        System.out.println("Adding " + cheese.getName());
    }
}
