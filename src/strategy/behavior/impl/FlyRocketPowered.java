package strategy.behavior.impl;

import strategy.behavior.FlyBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/24
 * Time: 14:27
 * Description:
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
