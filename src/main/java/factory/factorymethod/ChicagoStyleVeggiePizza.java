package factory.factorymethod;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Sauce and Veggie Pizza";
        dough  = "Deep Dish Dough";
        sauce = "Marinara Sauce";
        toppings.add("Peppers");
        toppings.add("Mushrooms");
        toppings.add("Onions");
    }
}
