package com.System.Design.SystemDesign.DesignPattern.DecoratorDesignPattern;

import com.System.Design.SystemDesign.DesignPattern.DecoratorDesignPattern.impl.ExtraCheese;
import com.System.Design.SystemDesign.DesignPattern.DecoratorDesignPattern.impl.Mushrooms;
import com.System.Design.SystemDesign.DesignPattern.DecoratorDesignPattern.impl.VegDelight;

public class DecoratorMain {
    public static void main(String[] args) {
        BasePizza basePizza = new ExtraCheese(new Mushrooms(new VegDelight()));

        System.out.println(basePizza.getDescription() + "\n Price: " + basePizza.getPrice());
    }
}

//Example like car, coffee and pizza
