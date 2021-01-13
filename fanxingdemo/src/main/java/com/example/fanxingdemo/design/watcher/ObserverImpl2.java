package com.example.fanxingdemo.design.watcher;

/**
 * @Author: xuwei
 * @Date: 2021/1/13 14:31
 * @Description: 观察者2
 */
public class ObserverImpl2 implements Observer {
    String name;

    public ObserverImpl2(String name) {
        this.name = name;
    }

    @Override
    public void getMessage(String s) {
        System.out.println(name + "收到内容：" + s);
    }
}
