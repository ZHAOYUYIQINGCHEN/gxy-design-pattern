package com.gxy.design.pattern.decorator;

/**
 * @program: gxy-design-pattern
 * @description:
 * @author: guoxiaoying01
 * @create: 2022-08-29 21:15
 **/
public class DarkRoast extends Beverage{
    public DarkRoast() {
        /**
         * 为了要设置饮料的描述，我 们写了一个构造器。记住， description实例变量继承自 Beverage。
         */
        description = "DarkRoast";
    }

    /**
     * 最后，DarkRoast，现在不 需要管调料的价钱，直接把DarkRoast的价 格$1.99返回即可。
     * @return
     */
    public double cost() {
        return 1.05;
    }
}
