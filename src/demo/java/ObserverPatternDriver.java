import observer.CurrentConditionDisplay;
import observer.WeatherData;

public class ObserverPatternDriver {

    /**
     * Observer Pattern - Keeping your objects in the know
     * Objects can decide at runtime whether they want to be kept informed
     *
     * Weather Monitoring Application Overview
     * WeatherData object talks to physical Weather Station to get updated data
     */

    public static void main(String[] args){

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(90, 70, 40);
        weatherData.removeObserver(currentDisplay);
        weatherData.setMeasurements(100, 80, 50.5f);
        weatherData.registerObserver(currentDisplay);

    }
}
