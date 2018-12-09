import factory.abstractfactory.FancyChicagoPizzaStore;
import factory.abstractfactory.FancyNYPizzaStore;
import factory.abstractfactory.FancyPizza;
import factory.abstractfactory.FancyPizzaStore;
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
     *
     * Dependency Inversion:
     * High level PizzaStore and low level concrete-pizzas both
     * depend on Pizza class
     */

    public static void simpleFactoryDriver() {
        SimplePizzaStore store = new SimplePizzaStore(new SimplePizzaFactory());
        SimplePizza cheeseyPizza = store.orderPizza("cheese");
        System.out.println("simple cheese pizza = " + cheeseyPizza.getName() + "\n");
    }

    public static void factoryMethodDriver() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        Pizza anotherPizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + anotherPizza.getName() + "\n");
    }

    public static void abstractFactoryDriver() {
        FancyPizzaStore nyStore = new FancyNYPizzaStore();
        FancyPizza pizza = nyStore.orderPizza("cheese");
        System.out.println("here's a another pizza: " + pizza.getName() + "\n");

        FancyPizzaStore chiStore = new FancyChicagoPizzaStore();
        FancyPizza stillMorePizza = chiStore.orderPizza("cheese");
        System.out.println("can't get enough pizza: " + stillMorePizza.getName() + "\n");

        FancyPizza oneMore = nyStore.orderPizza("veggie");
        System.out.println("last one: " + oneMore.getName());
    }

    public static void main(String[] args) {
        simpleFactoryDriver();
        System.out.println("##########################");
        factoryMethodDriver();
        System.out.println("##########################");
        abstractFactoryDriver();

    }
}
