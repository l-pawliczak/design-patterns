package com.lpawliczak.observer.notification;

import com.lpawliczak.observer.weather.forecast.WeatherForecast;

public class TvNews implements ForecastObserver {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.printf(NOTIFY_FORMAT, "TV", weatherForecast.getTemperature(), weatherForecast.getPressure());
    }
}
