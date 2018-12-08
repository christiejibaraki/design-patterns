package decorator.starbuzz;

public class Whip extends CondimentDecorator {

    Beverage beverage; //instance variable to hold beverage that's wrapped

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + 0.15;
    }
}
