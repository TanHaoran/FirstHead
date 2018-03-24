package strategy.behavior.impl;

import strategy.behavior.QuackBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/24
 * Time: 14:06
 * Description:
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
