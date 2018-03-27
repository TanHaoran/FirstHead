package singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/27
 * Time: 16:54
 * Description:
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
