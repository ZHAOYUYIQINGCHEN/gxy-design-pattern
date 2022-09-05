package com.gxy.design.pattern.observer.custom;

import java.util.ArrayList;

/**
 * @program: gxy-design-pattern
 * @description: WeatherData现在实现了 Subject接口。
 * @author: guoxiaoying01
 * @create: 2022-08-28 21:38
 **/
public class WeatherData implements Subject{

    // 我们加上一个ArrayList来纪录观察 者，此ArrayList是在构造器中建立 的。
    private ArrayList observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    // 当注册观察者时，我们只要把它加 到ArrayList的后面即可。 同样地，当观察者想取消注册，我们把 它从ArrayList中删除即可。
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }

    }


    /**
     * 有趣的地方来了！在这里，我们 把状态告诉每一个观察者。因为 观察者都实现了update()，所以我 们知道如何通知它们。
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当从气象站得到更新观测值 时，我们通知观察者。
     */
    public void measurementsChanges() {
        notifyObservers();
    }

    public void setMeasurements(double temperature,double humidity,double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanges();
    }
}
