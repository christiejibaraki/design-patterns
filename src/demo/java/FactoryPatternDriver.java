import factory.factorymethod.ChicagoPizzaStore;
import factory.factorymethod.NYPizzaStore;
import factory.factorymethod.Pizza;
import factory.factorymethod.PizzaStore;
import factory.simplefactory.SimplePizza;
import factory.simplefactory.SimplePizzaFactory;
import factory.simplefactory.SimplePizzaStore;

public class FactoryPatternDriver {

    /***
     * Factory patterns encapsulate object creation
     */

    public static void simpleFactoryDriver(){
        SimplePizzaStore store = new SimplePizzaStore(new SimplePizzaFactory());
        SimplePizza cheeseyPizza = store.orderPizza("cheese");
        System.out.println("simple cheese pizza = " + cheeseyPizza.getName() + "\n");
    }

    public static void factoryMethodDriver(){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        Pizza anotherPizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + anotherPizza.getName());
    }

    public static void main(String[] args){
        simpleFactoryDriver();
        factoryMethodDriver();

    }
}
