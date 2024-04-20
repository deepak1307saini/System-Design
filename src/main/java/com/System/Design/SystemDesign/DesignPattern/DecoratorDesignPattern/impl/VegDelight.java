package com.System.Design.SystemDesign.DesignPattern.DecoratorDesignPattern.impl;

import com.System.Design.SystemDesign.DesignPattern.DecoratorDesignPattern.BasePizza;
import org.springframework.stereotype.Service;

@Service
public class VegDelight implements BasePizza {
    @Override
    public String getDescription() {
        return "This is a VegDelight Pizza with toppings";
    }

    @Override
    public double getPrice() {
        return 150.0;
    }
}
