package com.example.fanxingdemo.design.factorymethod;

/**
 * @Author: xuwei
 * @Date: 2020/12/25 14:16
 * @Description: 工厂方法模式：
 * 总结：工厂模式可以说是简单工厂模式的进一步抽象和拓展，在保留了简单工厂的封装优点的同时，让扩展变得简单，让继承变得可行，增加了多态性的体现。
 * 应用场景：
 * (1)当一个类不知道它所需要的对象的类时在工厂方法模式中，客户端不需要知道具体产品类的类名，只需要知道所对应的工厂即可；
 * (2)当一个类希望通过其子类来指定创建对象时在工厂方法模式中，对于抽象工厂类只需要提供一个创建产品的接口，而由其子类来确定具体要创建的对象，
 * 利用面向对象的多态性和里氏代换原则，在程序运行时，子类对象将覆盖父类对象，从而使得系统更容易扩展。
 * (3)将创建对象的任务委托给多个工厂子类中的某一个，客户端在使用时可以无须关心是哪一个工厂子类创建产品子类，需要时再动态指定，可将具体工厂类的类名存储在配置文件或数据库中。
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        factoryA.createProduct().show();

        FactoryB factoryB = new FactoryB();
        factoryB.createProduct().show();
    }
}

/**
 * 步骤1：创建抽象工厂类
 */
abstract class Factory {
    abstract Product createProduct();
}

/**
 * 步骤2：创建抽象产品类
 */
abstract class Product {
    abstract void show();
}

/**
 * 创建具体产品类
 */
class ProductA extends Product {
    @Override
    void show() {
        System.out.println("生产了A");
    }
}

class ProductB extends Product {
    @Override
    void show() {
        System.out.println("生产了B");
    }
}

/**
 * 创建具体工厂类
 */
class FactoryA extends Factory {
    @Override
    Product createProduct() {
        return new ProductA();
    }
}

class FactoryB extends Factory {
    @Override
    Product createProduct() {
        return new ProductB();
    }
}
