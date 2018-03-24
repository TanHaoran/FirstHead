package observer;


import observer.java.CurrentConditionsDisplay;
import observer.java.ForecastDisplay;
import observer.java.StatisticsDisplay;
import observer.java.WeatherData;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/3/24
 * Time: 16:03
 * Description:
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // 创建3个面板
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);

        // 改变状态，发出推送
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
