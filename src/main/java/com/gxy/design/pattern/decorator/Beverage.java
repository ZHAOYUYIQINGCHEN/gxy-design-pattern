package com.gxy.design.pattern.decorator;

/**
 * @program: gxy-design-pattern
 * @description: 饮料类（抽象组件类）
 * Beverage是一个抽象类，有两个方 法：getDescrip-tion()及cost()。 getDescription()已经在此实现了， 但是cost()必须在子类中实现。
 *
 * @author: guoxiaoying01
 * @create: 2022-08-29 20:58
 **/
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
