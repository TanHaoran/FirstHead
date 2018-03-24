package strategy.animal;

import strategy.behavior.impl.FlyWithWings;
import strategy.behavior.impl.Quack;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/24
 * Time: 13:54
 * Description: 外观是绿头的鸭子
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
