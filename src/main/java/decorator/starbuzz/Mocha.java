package decorator.starbuzz;

public class Mocha extends CondimentDecorator {

    Beverage beverage; //instance variable to hold beverage that's wrapped

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + 0.20;
    }
}
