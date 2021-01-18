package com.example.fanxingdemo.design.abstractfactory;


/**
 * @Author: xuwei
 * @Date: 2020/12/25 14:57
 * @Description: 抽象工厂模式：
 * 象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Factory1 factory1 = new Factory1();
        factory1.createFruit().show();
        factory1.createPhone().show();

        System.out.println();
        Factory2 factory2 = new Factory2();
        factory2.createFruit().show();
        factory2.createPhone().show();
    }
}

/**
 * 步骤1：创建抽象工厂类，定义具体工厂的公共接口
 */
abstract class AbstractFactory {
    public abstract Fruit createFruit();

    public abstract Phone createPhone();
}

/**
 * 步骤2：抽象产品类
 */
interface Fruit {
    void show();
}

interface Phone {
    void show();
}

/**
 * 步骤3：具体产品类
 */
class Apple implements Fruit {
    @Override
    public void show() {
        System.out.println("生产了Apple");
    }
}

class Orange implements Fruit {
    @Override
    public void show() {
        System.out.println("生产了Orange");
    }
}


class XiaoMi implements Phone {
    @Override
    public void show() {
        System.out.println("生产了XiaoMi");
    }
}

class HuaWei implements Phone {
    @Override
    public void show() {
        System.out.println("生产了HuaWei");
    }
}

/**
 * 步骤4：具体工厂接口
 */
class Factory1 extends AbstractFactory {

    @Override
    public Fruit createFruit() {
        return new Apple();
    }

    @Override
    public Phone createPhone() {
        return new XiaoMi();
    }
}

class Factory2 extends AbstractFactory {
    @Override
    public Fruit createFruit() {
        return new Orange();
    }

    @Override
    public Phone createPhone() {
        return new HuaWei();
    }
}

