package com.gxy.design.pattern.factory.pizzafm;

/**
 * @program: gxy-design-pattern
 * @description: 创造者
 * @author: guoxiaoying01
 * @create: 2022-09-04 21:37
 **/
// 抽象创造者类
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 实例化 披萨 的责任被移到一个方法中，此方法如同一个工厂（工厂方法）
    protected abstract Pizza createPizza(String type);
}
