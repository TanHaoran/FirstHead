package observer.java;

import observer.our.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/24
 * Time: 15:57
 * Description:
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + temperature
                + "/" + temperature + "/" + temperature);
    }
}
