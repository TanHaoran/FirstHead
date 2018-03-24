package observer.our;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/24
 * Time: 15:57
 * Description:
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;

    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: More of the same");
    }
}
