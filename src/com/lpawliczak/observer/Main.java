package com.lpawliczak.observer;

import com.lpawliczak.observer.notification.InternetNews;
import com.lpawliczak.observer.notification.RadioNews;
import com.lpawliczak.observer.notification.TvNews;
import com.lpawliczak.observer.weather.forecast.WeatherForecast;

public class Main {
    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(19, 1005);

        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();
        InternetNews internetNews = new InternetNews();

        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.registerObserver(internetNews);

        weatherForecast.notifyObservers();

        System.out.println("----------------------------");
        weatherForecast.updateForecast(5, 930);
    }
}
