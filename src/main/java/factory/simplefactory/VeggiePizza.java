package factory.simplefactory;

public class VeggiePizza extends SimplePizza {

    public VeggiePizza() {
        name = "Veggie SimplePizza";
        dough  = "Simple Dough";
        sauce = "Marinara Sauce";
        toppings.add("Peppers");
        toppings.add("Mushrooms");
        toppings.add("Onions");
    }
}
