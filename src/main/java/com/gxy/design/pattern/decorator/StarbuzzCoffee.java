package com.gxy.design.pattern.decorator;

/**
 * @program: gxy-design-pattern
 * @description:
 * @author: guoxiaoying01
 * @create: 2022-08-29 21:13
 **/
public class StarbuzzCoffee {
    public static void main(String args[]) {
        /**
         * 订一杯Espresso，不需要调料，打印 出它的描述与价钱。
         *
         */
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        /**
         * 制造出一个DarkRoast对象。
         *
         */
        Beverage beverage2 = new DarkRoast();
        /**
         * 用Mocha装饰它。
         *
         */
        beverage2 = new Mocha(beverage2);
        /**
         * 用第二个Mocha装饰它。
         *
         */
        beverage2 = new Mocha(beverage2);

        /**
         * 用Whip装饰它。
         *
         */
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());


        /**
         * 最后，再来一杯调料为豆浆、摩 卡、奶泡的HouseBlend咖啡。
         *
         */
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }

}
