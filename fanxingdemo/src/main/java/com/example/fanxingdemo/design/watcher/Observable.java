package com.example.fanxingdemo.design.watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuwei
 * @Date: 2021/1/13 14:33
 * @Description: 被观察者
 */
public class Observable {
    List<Observer> observers = new ArrayList<>();

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 被观察者通知观察者
     */
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).getMessage("被观察者发送的消息");
        }
    }
}
