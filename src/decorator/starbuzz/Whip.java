package decorator.starbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/25
 * Time: 16:20
 * Description: 奶泡
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
