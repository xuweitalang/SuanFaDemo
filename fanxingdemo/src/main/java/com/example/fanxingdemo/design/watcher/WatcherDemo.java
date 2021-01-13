package com.example.fanxingdemo.design.watcher;

/**
 * @Author: xuwei
 * @Date: 2021/1/13 14:40
 * @Description: 观察者模式
 */
public class WatcherDemo {

    public static void main(String[] args) {
        Observer observer1 = new ObserverImpl1("zhangsan");
        Observer observer2 = new ObserverImpl2("lisi");
        Observable observable = new Observable();
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.notifyObserver();
    }
}
