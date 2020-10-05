package com.lpawliczak.observer.weather.forecast;

import com.lpawliczak.observer.notification.ForecastObserver;
import com.lpawliczak.observer.weather.Observable;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {
    private int temperature;
    private int pressure;
    private final Set<ForecastObserver> registeredObservers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(ForecastObserver forecastObserver) {
        registeredObservers.add(forecastObserver);
    }

    @Override
    public void unregisterObserver(ForecastObserver forecastObserver) {
        registeredObservers.remove(forecastObserver);
    }

    @Override
    public void notifyObservers() {
        for (ForecastObserver forecastObserver : registeredObservers) {
            forecastObserver.updateForecast(this);
        }
    }

    public void updateForecast(int temperature, int pressure) {
        setTemperature(temperature);
        setPressure(pressure);
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
