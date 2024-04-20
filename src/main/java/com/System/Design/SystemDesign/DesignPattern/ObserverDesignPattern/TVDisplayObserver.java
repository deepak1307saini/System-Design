package com.System.Design.SystemDesign.DesignPattern.ObserverDesignPattern;

public class TVDisplayObserver implements DisplayObserver {
    private Observable observable;

    public TVDisplayObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable) {
        System.out.println("TV display updated: " + observable.getValue());
    }
}
