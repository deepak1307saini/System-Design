package com.System.Design.SystemDesign.DesignPattern.DecoratorDesignPattern.impl;

import com.System.Design.SystemDesign.DesignPattern.DecoratorDesignPattern.BasePizza;
import org.springframework.stereotype.Service;

@Service
public class Margherita implements BasePizza {
    @Override
    public String getDescription() {
        return "This is a Margherita Pizza";
    }
    @Override
    public double getPrice() {
        return 200.0;
    }
}
