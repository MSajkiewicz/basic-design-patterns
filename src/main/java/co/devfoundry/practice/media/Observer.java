package co.devfoundry.practice.media;

import co.devfoundry.practice.weatherForecast.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
