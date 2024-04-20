package com.System.Design.SystemDesign.DesignPattern.AbstractFactoryDesignPattern.impl;

import com.System.Design.SystemDesign.DesignPattern.AbstractFactoryDesignPattern.Vehicle;

public class LuxuryBike implements Vehicle {

    @Override
    public void printDetails() {
        System.out.println("This is a luxury bike with premium features.");
    }
}
