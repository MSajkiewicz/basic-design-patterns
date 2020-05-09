package co.devfoundry.practice.media;

import co.devfoundry.practice.weatherForecast.WeatherForecast;

public class RadioNews implements Observer{
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Weather forecast for Radio News: temperature = " + weatherForecast.getTemperature() + ", pressure: " + weatherForecast.getPressure());
    }
}
