package factory.simplefactory;

public class SimplePizzaStore {

    SimplePizzaFactory factory;

    public SimplePizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public SimplePizza orderPizza(String type) {
        SimplePizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
