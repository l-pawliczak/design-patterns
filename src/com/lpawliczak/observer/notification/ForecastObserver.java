package com.lpawliczak.observer.notification;

import com.lpawliczak.observer.weather.forecast.WeatherForecast;

public interface ForecastObserver {
    String NOTIFY_FORMAT = "%s - new weather forecast: temperature: %d degrees, preassure: %d hPa";

    void updateForecast(WeatherForecast weatherForecast);
}
