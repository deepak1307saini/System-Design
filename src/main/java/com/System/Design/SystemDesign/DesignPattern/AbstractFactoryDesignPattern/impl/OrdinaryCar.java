package com.System.Design.SystemDesign.DesignPattern.AbstractFactoryDesignPattern.impl;

import com.System.Design.SystemDesign.DesignPattern.AbstractFactoryDesignPattern.Vehicle;

public class OrdinaryCar implements Vehicle {

    @Override
    public void printDetails() {
        System.out.println("This is an ordinary car with basic features.");
    }
}
