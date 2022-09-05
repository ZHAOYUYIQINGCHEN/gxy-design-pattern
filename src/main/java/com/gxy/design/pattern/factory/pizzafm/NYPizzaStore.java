package com.gxy.design.pattern.factory.pizzafm;

/**
 * @program: gxy-design-pattern
 * @description: 具体创造者
 * @author: guoxiaoying01
 * @create: 2022-09-04 21:57
 **/
public class NYPizzaStore extends PizzaStore{

    // 生产具体产品
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
