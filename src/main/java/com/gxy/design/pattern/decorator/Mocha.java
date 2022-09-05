package com.gxy.design.pattern.decorator;

/**
 * @program: gxy-design-pattern
 * @description: 具体装饰器
 * @author: guoxiaoying01
 * @create: 2022-08-29 21:09
 **/

/**
 * 摩卡是一个装饰者，所以让它扩 展自CondimentDecorator。
 */
public class Mocha extends CondimentDecorator {
    /**
     * 要让Mocha能够引用一个Beverage，做 法如下：
     * (1)用一个实例变量记录饮料，也就 是被装饰者。
     * (2)想办法让被装饰者（饮料）被记 录到实例变量中。
     * 这里的做法是：把 饮料当作构造器的参数，再由构造器 将此饮料记录在实例变量中。
     *
     */
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 我们希望叙述不只是描述饮料（例 如“DarkRoast”），
     * 而是完整地连调料都 描述出来（例如“DarkRoast, Mocha”）。
     * 所以首先利用委托的做法，得到一个 叙述，然后在其后加上附加的叙述（例 如“Mocha”）。
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() +",Mocha";
    }

    /**
     * 要计算带Mocha饮料的价钱。首先把调用委 托给被装饰对象，以计算价钱，然后再加 上Mocha的价钱，得到最后结果。
     *
     * @return
     */
    @Override
    public double cost() {
        return 0.20+beverage.cost();
    }
}
