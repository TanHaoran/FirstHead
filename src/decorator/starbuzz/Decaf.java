package decorator.starbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/25
 * Time: 16:19
 * Description: 低咖啡因
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
