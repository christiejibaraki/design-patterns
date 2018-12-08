package decorator.starbuzz;

public class Epresso extends Beverage {

    public Epresso(){
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
