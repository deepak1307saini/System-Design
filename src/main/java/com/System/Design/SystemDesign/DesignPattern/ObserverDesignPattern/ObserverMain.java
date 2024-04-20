package com.System.Design.SystemDesign.DesignPattern.ObserverDesignPattern;

public class ObserverMain {
    public static void main(String[] args) {
        WeatherStationObservableImpl weatherObservable = new WeatherStationObservableImpl();
        CricketScoreObservableImpl cricketObservable = new CricketScoreObservableImpl();

        MobileDisplayObserver mobileDisplay = new MobileDisplayObserver(weatherObservable);
        TVDisplayObserver tvDisplay = new TVDisplayObserver( cricketObservable);

        weatherObservable.setTemperature(72);
        cricketObservable.setScore(200);

        weatherObservable = new WeatherStationObservableImpl();
        cricketObservable = new CricketScoreObservableImpl();

        mobileDisplay = new MobileDisplayObserver(cricketObservable);
        tvDisplay = new TVDisplayObserver(weatherObservable);

        weatherObservable.setTemperature(80);
        cricketObservable.setScore(250);
    }
}
