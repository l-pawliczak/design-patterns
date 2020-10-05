package com.lpawliczak.observer.notification;

import com.lpawliczak.observer.weather.forecast.WeatherForecast;

public class RadioNews implements ForecastObserver {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.printf(NOTIFY_FORMAT, "Radio", weatherForecast.getTemperature(), weatherForecast.getPressure());
    }
}
