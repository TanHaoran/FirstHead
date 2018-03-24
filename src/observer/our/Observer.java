package observer.our;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/24
 * Time: 15:20
 * Description:
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);
}
