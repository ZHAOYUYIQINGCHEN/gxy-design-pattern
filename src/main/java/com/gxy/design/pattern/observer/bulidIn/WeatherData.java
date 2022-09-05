package com.gxy.design.pattern.observer.bulidIn;

import java.util.Observable;

/**
 * @program: gxy-design-pattern
 * @description: 利用内置的支持重做气象站
 * 我们不再需要追踪观察者了，也不 需要管理注册与删除（让超类代劳 即可）。所以我们把注册、添加、 通知的相关代码删除。
 * @author: guoxiaoying01
 * @create: 2022-08-28 21:56
 **/
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 我们的构造器不再需要为了 记住观察者们而建立数据结 构了。
     *
     */
    public WeatherData() {

    }

    public void measurementsChanged() {
        /**
         * 在调用notifuObservers()之前，要先调 用setChanged()来指示状态已经改变。
         */
        setChanged();
        /**
         * 注意：我们没有调用 notifyObservers()传送数据对 象，这表示我们采用的做法 是“拉”。
         */
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * 这些并不是新方法，只是因为我们 要使用“拉”的做法，所以才提醒 你有这些方法。观察者会利用这些方 法取得WeatherData对象的状态。
     *
     * @return
     */
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }


}
