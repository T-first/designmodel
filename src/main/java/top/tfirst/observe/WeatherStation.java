package top.tfirst.observe;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(1,2,3f);
        weatherData.setMeasurements(2,3,4f);


    }
}
