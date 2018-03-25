package decorator.starbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/25
 * Time: 16:26
 * Description:
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        // 一杯不需要调料的Espresso
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        // 一杯加了2份Mocha和1份Whip的DarkRoast
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        // 一杯加了1份Soy1份Mocha和1份Whip的HouseBlend
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
