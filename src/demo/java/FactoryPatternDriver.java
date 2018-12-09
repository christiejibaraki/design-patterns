import factory.factorymethod.ChicagoPizzaStore;
import factory.factorymethod.NYPizzaStore;
import factory.factorymethod.Pizza;
import factory.factorymethod.PizzaStore;

public class FactoryPatternDriver {

    public static void factoryMethodDriver(){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        Pizza anotherPizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + anotherPizza.getName());
    }

    public static void main(String[] args){

        factoryMethodDriver();

    }
}
