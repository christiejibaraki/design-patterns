package factory.abstractfactory;

import factory.abstractfactory.ingredients.interfaces.Dough;
import factory.abstractfactory.ingredients.interfaces.Sauce;
import factory.abstractfactory.ingredients.interfaces.Veggies;
import factory.abstractfactory.ingredients.interfaces.Cheese;


public abstract class FancyPizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
