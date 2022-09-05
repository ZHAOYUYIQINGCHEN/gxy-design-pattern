package com.gxy.design.pattern.factory.pizzafm;

import java.util.ArrayList;

/**
 * @program: gxy-design-pattern
 * @description: 抽象产品类
 * @author: guoxiaoying01
 * @create: 2022-09-04 21:38
 **/
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    // 此抽象类提供了某些默认的基本做法，用来进行烘烤，切片，装盒
    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough……");
        System.out.println("Adding sauce……");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" "+ toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
