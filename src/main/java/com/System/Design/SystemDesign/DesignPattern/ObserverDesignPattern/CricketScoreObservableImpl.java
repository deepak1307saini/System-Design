package com.System.Design.SystemDesign.DesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CricketScoreObservableImpl implements Observable {
    private List<DisplayObserver> observers = new ArrayList<>();
    private int score;

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
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        notifyObservers();
    }
}
