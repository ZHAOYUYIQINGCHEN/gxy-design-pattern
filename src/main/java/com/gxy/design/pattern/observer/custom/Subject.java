package com.gxy.design.pattern.observer.custom;

/**
 * @program: gxy-design-pattern
 * @description: 主题
 * @author: guoxiaoying01
 * @create: 2022-08-28 21:31
 **/
public interface Subject {
    /**
     * 注册观察者
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 删除观察者
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 当主题状态改变时，这个方法会被调用，以通知所有观察者
     */
    public void notifyObservers();
}
