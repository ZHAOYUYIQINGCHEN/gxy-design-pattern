package com.gxy.design.pattern.decorator;

/**
 * @program: gxy-design-pattern
 * @description: 混合咖啡（具体组件类）
 * @author: guoxiaoying01
 * @create: 2022-08-29 21:06
 **/
public class HouseBlend extends Beverage{
    public HouseBlend() {
        /**
         * 为了要设置饮料的描述，我 们写了一个构造器。记住， description实例变量继承自 Beverage。
         */
        description = "House Blend Coffee";
    }

    /**
     * 最后，需要计算HouseBlend的价钱，现在不 需要管调料的价钱，直接把HouseBlend的价 格$1.99返回即可。
     * @return
     */
    public double cost() {
        return 0.89;
    }
}
