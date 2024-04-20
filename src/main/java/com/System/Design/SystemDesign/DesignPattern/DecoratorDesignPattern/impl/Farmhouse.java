package com.System.Design.SystemDesign.DesignPattern.DecoratorDesignPattern.impl;

import com.System.Design.SystemDesign.DesignPattern.DecoratorDesignPattern.BasePizza;
import org.springframework.stereotype.Service;

@Service
public class Farmhouse implements BasePizza {
    @Override
    public String getDescription() {
        return "This is a Farmhouse Pizza";
    }
    @Override
    public double getPrice() {
        return 250.0;
    }
}
