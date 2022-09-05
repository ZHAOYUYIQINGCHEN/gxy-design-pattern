package com.gxy.design.pattern.decorator;

/**
 * @program: gxy-design-pattern
 * @description: 调料装饰器（抽象装饰器）
 * @author: guoxiaoying01
 * @create: 2022-08-29 20:59
 **/

/**
 * 首先，必须让Condiment Decorator能 够取代Beverage，所以将Condiment Decorator扩展自 Beverage 类。
 *
 */
public abstract class CondimentDecorator extends Beverage{
    /**
     * 所有的调料装饰者都必须重新实现 getDescription()方法。
     * @return
     */
    public abstract String getDescription();
}
