package com.System.Design.SystemDesign.DesignPattern.DecoratorDesignPattern;

public abstract class ToppingDecorator implements BasePizza {
    protected BasePizza pizza;

    protected ToppingDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }
}
