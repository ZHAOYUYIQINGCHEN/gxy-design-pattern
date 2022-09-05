package com.gxy.design.pattern.decorator;

/**
 * @program: gxy-design-pattern
 * @description: 奶泡
 * @author: guoxiaoying01
 * @create: 2022-08-29 21:19
 **/
public class Whip extends CondimentDecorator{
    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1.99+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +",Whip";
    }
}
