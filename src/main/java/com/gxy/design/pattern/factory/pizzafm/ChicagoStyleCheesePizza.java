package com.gxy.design.pattern.factory.pizzafm;

/**
 * @program: gxy-design-pattern
 * @description: 芝加哥披萨
 * @author: guoxiaoying01
 * @create: 2022-09-04 21:49
 **/
public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish  Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
