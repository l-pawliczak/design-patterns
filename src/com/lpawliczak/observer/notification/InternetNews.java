package com.lpawliczak.observer.notification;

import com.lpawliczak.observer.weather.forecast.WeatherForecast;

public class InternetNews implements ForecastObserver {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.printf(NOTIFY_FORMAT, "Internet", weatherForecast.getTemperature(), weatherForecast.getPressure());
    }
}
