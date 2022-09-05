package com.gxy.design.pattern.decorator;

/**
 * @program: gxy-design-pattern
 * @description: 豆浆（具体装饰器）
 * @author: guoxiaoying01
 * @create: 2022-08-29 21:18
 **/
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.99+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }
}
