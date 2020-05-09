package co.devfoundry.practice.media;

import co.devfoundry.practice.weatherForecast.WeatherForecast;

public class InternetNews implements Observer {

    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Weather forecast for Internet News: temperature = " + weatherForecast.getTemperature() + ", pressure: " + weatherForecast.getPressure());
    }
}
