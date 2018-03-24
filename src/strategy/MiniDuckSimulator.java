package strategy;

import strategy.animal.Duck;
import strategy.animal.MallardDuck;
import strategy.animal.ModelDuck;
import strategy.behavior.impl.FlyRocketPowered;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/24
 * Time: 14:11
 * Description:
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
