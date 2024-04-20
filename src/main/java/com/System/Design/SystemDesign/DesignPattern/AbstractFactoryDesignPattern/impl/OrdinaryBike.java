package com.System.Design.SystemDesign.DesignPattern.AbstractFactoryDesignPattern.impl;

import com.System.Design.SystemDesign.DesignPattern.AbstractFactoryDesignPattern.Vehicle;

public class OrdinaryBike implements Vehicle {

    @Override
    public void printDetails() {
        System.out.println("This is an ordinary bike with basic features.");
    }
}
