package co.devfoundry.practice.media;

import co.devfoundry.practice.weatherForecast.WeatherForecast;

public class TvNews implements Observer {

    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Weather forecast for TV News: temperature = " + weatherForecast.getTemperature() + ", pressure: " + weatherForecast.getPressure());
    }
}
