package com.gxy.design.pattern.singleton;

/**
 * @program: gxy-design-pattern
 * @description: 单件模式
 * @author: guoxiaoying01
 * @create: 2022-09-05 23:41
 **/
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
