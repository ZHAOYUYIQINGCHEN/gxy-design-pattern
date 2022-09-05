package com.gxy.design.pattern.observer.custom;

/**
 * @program: gxy-design-pattern
 * @description:
 * @author: guoxiaoying01
 * @create: 2022-08-28 21:46
 **/

/**
 * 此布告板实现了Observer接口，所以 可以从WeatherData对象中获得改变。
 * 它也实现了DisplayElement接口， 因为我们的API规定所有的布告 板都必须实现此接口。
 *
 */
public class CurrentConditionsDisplay implements Observer ,DisplayElement{
    private double temperature;
    private double humidity;
    private Subject weatherData;

    /**
     * 构造器需要 weatherData对象（也 就是主题）作为注册之用。
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 当update()被调用时，我们 把温度和湿度保存起来， 然后调用display()。
     */
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    /**
     * 当update()被调用时，我们 把温度和湿度保存起来， 然后调用display()。
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }


}
