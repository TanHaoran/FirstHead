package decorator.starbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/25
 * Time: 16:20
 * Description: 摩卡
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
