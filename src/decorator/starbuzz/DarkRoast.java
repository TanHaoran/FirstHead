package decorator.starbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/25
 * Time: 16:19
 * Description: 深焙
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
