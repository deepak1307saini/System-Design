package com.System.Design.SystemDesign.DesignPattern.AbstractFactoryDesignPattern.impl;

import com.System.Design.SystemDesign.DesignPattern.AbstractFactoryDesignPattern.Vehicle;
import com.System.Design.SystemDesign.DesignPattern.AbstractFactoryDesignPattern.VehicleFactory;

public class LuxuryVehicleFactory extends VehicleFactory {

    @Override
    public Vehicle createCar() {
        return new LuxuryCar();
    }

    @Override
    public Vehicle createBike() {
        return new LuxuryBike();
    }
}
