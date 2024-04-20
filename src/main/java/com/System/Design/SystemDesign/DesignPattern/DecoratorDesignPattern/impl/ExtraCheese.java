package com.System.Design.SystemDesign.DesignPattern.DecoratorDesignPattern.impl;

import com.System.Design.SystemDesign.DesignPattern.DecoratorDesignPattern.BasePizza;
import com.System.Design.SystemDesign.DesignPattern.DecoratorDesignPattern.ToppingDecorator;
import org.springframework.stereotype.Service;

@Service
public class ExtraCheese extends ToppingDecorator {
    public ExtraCheese(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "->ExtraCheese";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 50.0;
    }
}
