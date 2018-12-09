package factory.simplefactory;

public class SimplePizzaFactory {

    public SimplePizza createPizza(String type){
        if (type.equals("cheese")) {
            return new CheesePizza();
        } else if (type.equals("veggie")) {
            return new VeggiePizza();
        } else{
            return null;
        }
    }
}
