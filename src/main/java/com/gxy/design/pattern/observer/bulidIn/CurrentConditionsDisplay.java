package com.gxy.design.pattern.observer.bulidIn;

import com.gxy.design.pattern.observer.custom.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: gxy-design-pattern
 * @description:
 * @author: guoxiaoying01
 * @create: 2022-08-28 22:00
 **/
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    /**
     * 现在构造器需要一 Observable当参数，并将 CurrentCondi-tionsDisplay对 象登记成为观察者。
     *
     * @param observable
     */
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * 现在构造器需要一 Observable当参数，并将 CurrentCondi-tionsDisplay对 象登记成为观察者。
     *
     * @param obs
     * @param arg
     */
    public void update(Observable obs, Object arg) {
        /**
         * 在 update()中，先确定可 观察者属于WeatherData类 型，然后利用 getter方法 获取温度和湿度测量值， 最后调用display()。
         *
         */
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}
