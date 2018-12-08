package decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {

    // CondimentDecorator must be interchangeable with Beverage
    // in order to extend the Beverage class

    public abstract String getDescription();
}
