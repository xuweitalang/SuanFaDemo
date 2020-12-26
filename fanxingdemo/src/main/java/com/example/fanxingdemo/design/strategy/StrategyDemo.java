package com.example.fanxingdemo.design.strategy;

/**
 * @Author: xuwei
 * @Date: 2020/12/26 12:25
 * @Description: 策略模式:
 * 定义：定义一系列算法，将每个算法封装到具有公共接口的一系列策略类中，从而使它们可以相互替换 & 让算法可在不影响客户端的情况下发生变化。
 */
public class StrategyDemo {
    public static void main(String[] args) {
        StrategyContext contextAdd = new StrategyContext(new StrategyAdd());
        int resAdd = contextAdd.executeStrategy(1, 2);
        System.out.println("resAdd = " + resAdd);

        StrategyContext contextSubtract = new StrategyContext(new StrategySubtract());
        int resSubtract = contextSubtract.executeStrategy(19, 12);
        System.out.println("resSubtract = " + resSubtract);
    }
}

/**
 * 步骤1：定义一个策略接口，封装公共方法
 */
interface Strategy {
    int doWork(int a, int b);
}

/**
 * 步骤2：定义具体的策略角色
 */
class StrategyAdd implements Strategy {
    @Override
    public int doWork(int a, int b) {
        return a + b;
    }
}

class StrategySubtract implements Strategy {
    @Override
    public int doWork(int a, int b) {
        return a - b;
    }
}

/**
 * 步骤3：定义环境角色：
 * 持有策略对象，在构造函数中传入一个具体的策略对象
 */
class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.doWork(a, b);
    }

}

