package com.System.Design.SystemDesign.DesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservableImpl implements Observable {
    private final List<DisplayObserver> observers = new ArrayList<>();
    private double temperature;

    @Override
    public void addObserver(DisplayObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(DisplayObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (DisplayObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public double getValue() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
