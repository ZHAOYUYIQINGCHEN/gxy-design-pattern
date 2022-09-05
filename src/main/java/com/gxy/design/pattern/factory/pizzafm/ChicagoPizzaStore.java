package com.gxy.design.pattern.factory.pizzafm;

/**
 * @program: gxy-design-pattern
 * @description: 芝加哥风味披萨店
 * @author: guoxiaoying01
 * @create: 2022-09-04 22:01
 **/
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
