package com.example.fanxingdemo.design.proxy;

/**
 * @Author: xuwei
 * @Date: 2021/1/14 13:45
 * @Description: 代理模式
 */
public class ProxySubjectDemo {
    public static void main(String[] args) {
        //构造一个真实主题对象
        RealSubject subject = new RealSubject();
        //通过真实主题对象构造一个代理主题对象
        ProxySubject proxySubject = new ProxySubject(subject);
        proxySubject.visit();
    }
}

//抽象主题类
abstract class Subject {
    abstract void visit();
}

//真实主题类
class RealSubject extends Subject {
    @Override
    void visit() {
        System.out.println("real subject");
    }
}

//代理类
class ProxySubject extends Subject {
    private RealSubject realSubject;

    public ProxySubject(RealSubject subject) { //持有真实主题的应用
        this.realSubject = subject;
    }

    @Override
    void visit() {
        realSubject.visit(); //调用真实对象的方法
    }
}
