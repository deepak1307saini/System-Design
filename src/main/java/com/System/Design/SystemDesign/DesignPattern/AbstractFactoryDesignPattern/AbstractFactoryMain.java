package com.System.Design.SystemDesign.DesignPattern.AbstractFactoryDesignPattern;

import com.System.Design.SystemDesign.DesignPattern.AbstractFactoryDesignPattern.impl.LuxuryVehicleFactory;
import com.System.Design.SystemDesign.DesignPattern.AbstractFactoryDesignPattern.impl.OrdinaryVehicleFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        VehicleFactory ordinaryFactory = new OrdinaryVehicleFactory();
        Vehicle car = ordinaryFactory.createCar();
        Vehicle bike = ordinaryFactory.createBike();
        car.printDetails();
        bike.printDetails();

        VehicleFactory luxuryFactory = new LuxuryVehicleFactory();
        car = luxuryFactory.createCar();
        bike = luxuryFactory.createBike();
        car.printDetails();
        bike.printDetails();
    }
}
