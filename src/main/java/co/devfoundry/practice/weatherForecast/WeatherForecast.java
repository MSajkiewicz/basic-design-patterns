package co.devfoundry.practice.weatherForecast;

import co.devfoundry.practice.media.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;
    private Set<Observer> registeredObservers = new HashSet<Observer>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer : registeredObservers){
            observer.updateForecast(this);
        }
    }

    public void updateForecast(int temperature, int pressure){
        setTemperature(temperature);
        setPressure(pressure);
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }



}
