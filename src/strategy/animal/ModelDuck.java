package strategy.animal;

import strategy.behavior.impl.FlyNoWay;
import strategy.behavior.impl.FlyWithWings;
import strategy.behavior.impl.Quack;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/24
 * Time: 14:24
 * Description:
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
