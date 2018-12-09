package factory.factorymethod;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza(){
        name = "New York Sauce and Veggie Pizza";
        dough  = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Olives");
        toppings.add("Peppers");
        toppings.add("Mushrooms");
        toppings.add("Onions");
    }
}
