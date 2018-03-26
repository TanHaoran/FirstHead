package factory;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/26
 * Time: 22:55
 * Description:
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
