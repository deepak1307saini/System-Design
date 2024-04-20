package com.System.Design.SystemDesign.DesignPattern.ObserverDesignPattern;

public class MobileDisplayObserver implements DisplayObserver {

    public MobileDisplayObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable) {
        System.out.println("Mobile display updated: " + observable.getValue());
    }
}
