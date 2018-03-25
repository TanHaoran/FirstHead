package decorator.starbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/25
 * Time: 16:04
 * Description: 饮料抽象类
 */
public abstract class Beverage {

    public static final int TALL = 0x101;
    public static final int GRANDE = 0x102;
    public static final int VENTI = 0x103;

    private int size;

    String description = "Unknown Beverage";


    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
