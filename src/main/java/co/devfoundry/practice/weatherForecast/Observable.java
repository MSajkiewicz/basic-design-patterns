package co.devfoundry.practice.weatherForecast;

import co.devfoundry.practice.media.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();


}
