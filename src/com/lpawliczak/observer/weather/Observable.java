package com.lpawliczak.observer.weather;

import com.lpawliczak.observer.notification.ForecastObserver;

public interface Observable {
    void registerObserver(ForecastObserver forecastObserver);
    void unregisterObserver(ForecastObserver forecastObserver);
    void notifyObservers();
}
