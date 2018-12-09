package factory.abstractfactory;

public abstract class FancyPizzaStore {


    public FancyPizza orderPizza(String type){
        FancyPizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // Factory method
    abstract FancyPizza createPizza(String type);

}
