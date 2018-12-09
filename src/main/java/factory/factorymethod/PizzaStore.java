package factory.factorymethod;

public abstract class PizzaStore {


    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // Factory method
    abstract Pizza createPizza(String type);

}
