package com.gxy.design.pattern.observer.custom;

/**
 * @program: gxy-design-pattern
 * @description:
 * @author: guoxiaoying01
 * @create: 2022-08-28 21:51
 **/
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4d);
        weatherData.setMeasurements(82, 70, 29.2d);
        weatherData.setMeasurements(78, 90, 29.2d);
    }

}
