package com.gxy.design.pattern.factory.pizzafm;

/**
 * @program: gxy-design-pattern
 * @description: 具体产品类：纽约披萨
 * @author: guoxiaoying01
 * @create: 2022-09-04 21:46
 **/
public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
