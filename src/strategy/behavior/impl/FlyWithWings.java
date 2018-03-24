package strategy.behavior.impl;

import strategy.behavior.FlyBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/24
 * Time: 14:03
 * Description:
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
