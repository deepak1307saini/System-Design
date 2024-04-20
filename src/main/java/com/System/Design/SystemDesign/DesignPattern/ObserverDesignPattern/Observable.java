package com.System.Design.SystemDesign.DesignPattern.ObserverDesignPattern;

public interface Observable {
    void addObserver(DisplayObserver observer);

    void removeObserver(DisplayObserver observer);

    void notifyObservers();

    double getValue();
}
