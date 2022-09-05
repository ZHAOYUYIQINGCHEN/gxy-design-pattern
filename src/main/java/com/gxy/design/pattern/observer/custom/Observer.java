package com.gxy.design.pattern.observer.custom;

/**
 * 观察者
 * 所有的观察者必须实现update方法，以实现观察者接口
 */
public interface Observer {

    /**
     * 当气象观测值发生改变时，主题会把这些状态值当作方法的参数，传送给观察者
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(double temp,double humidity,double pressure);
}
