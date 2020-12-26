package com.example.fanxingdemo.design.simplefactory;

/**
 * @Author: xuwei
 * @Date: 2020/12/25 14:01
 * @Description: 简单工厂方法模式
 * 工厂类集中了所有实例（产品）的创建逻辑，一旦这个工厂不能正常工作，整个系统都会受到影响；
 * 违背“开放 - 关闭原则”，一旦添加新产品就不得不修改工厂类的逻辑，这样就会造成工厂逻辑过于复杂。
 */
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        //步骤4：外界调用工厂类的静态方法，根据传入不同的参数来创建不同的产品实例。
        Factory factory = new Factory();
        factory.makeProduct("A").show();
        factory.makeProduct("B").show();
        factory.makeProduct("C").show();
    }
}

/**
 * 步骤1：创建抽象产品类
 */
abstract class Product {
    public abstract void show();
}

/**
 * 步骤2：创建具体产品类
 */
class ProductA extends Product {
    @Override
    public void show() {
        System.out.println("生产了A");
    }
}

class ProductB extends Product {

    @Override
    public void show() {
        System.out.println("生产了B");
    }
}

class ProductC extends Product {
    @Override
    public void show() {
        System.out.println("生产了C");
    }
}

/**
 * 步骤3：创建工厂类，通过创建静态方法从而根据传入不同的参数来创建不同具体产品类的实例
 */
class Factory {

    public Product makeProduct(String name) {
        switch (name) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            case "C":
                return new ProductC();
        }
        return null;
    }
}


