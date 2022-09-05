package com.gxy.design.pattern.decorator;

/**
 * @program: gxy-design-pattern
 * @description: 浓缩咖啡（具体组件类）
 * 首先，让Espresso扩展自 Beverage类，因为Espresso是 一种饮料。
 * @author: guoxiaoying01
 * @create: 2022-08-29 21:04
 **/
public class Espresso extends Beverage{
    public Espresso() {
        /**
         * 为了要设置饮料的描述，我 们写了一个构造器。记住， description实例变量继承自 Beverage。
         */
        description = "Espresso";
    }

    /**
     * 最后，需要计算Espresso的价钱，现在不 需要管调料的价钱，直接把Espresso的价 格$1.99返回即可。
     * @return
     */
    public double cost() {
        return 1.99;
    }
}
