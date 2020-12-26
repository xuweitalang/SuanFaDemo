package com.example.fanxingdemo.design.build;

/**
 * @Author: xuwei
 * @Date: 2020/12/26 12:52
 * @Description: 建造者模式：
 * 作用：将一个复杂的构建与其表示分离，使得同样的构建过程可以创建不同的表示。
 * 使用场景：多个部件或者零件，都可以装配到一个对象中，但是产生的运行结果又相同。
 * <p>
 * 建造者模式步骤：
 * 1. 定义一个静态内部类Builder，内部的成员变量和外部类一样；
 * 2. Builder类通过一系列的方法用于成员变量的赋值，并返回当前对象本身（this）；
 * 3. Builder类提供一个外部类的创建方法（build、create……），该方法内部调用了外部类的一个私有构造函数，入参就是内部类Builder；
 * 4. 外部类提供一个私有构造函数供内部类调用，在该构造函数中完成成员变量的赋值，取值为Builder对象中对应的成变量的值。
 */
public class BuildDemo {
    public static void main(String[] args) {
//        new Computer(new Computer.Builder().setBoard("inter")
//                .setDisplay("显示器").setOs("windows"));
        Computer computer = new Computer.Builder()
                .setBoard("主板")
                .setDisplay("显示器")
                .setOs("操作系统")
                .build();
    }
}


/**
 * 步骤1：创建一个产品类，定义多种属性。在构造方法中传入Builder对象，通过Builder来给产品属性赋值。
 */
class Computer {
    String board;
    String os;
    String display;

    public Computer(Builder builder) {
        this.board = builder.board;
        this.os = builder.os;
        this.display = builder.display;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     * 在产品类中创建一个静态内部类Builder,并定义与产品类中一样的属性。
     */
    static class Builder {
        String board;
        String os;
        String display;

        public String getBoard() {
            return board;
        }

        public Builder setBoard(String board) {
            this.board = board;
            return this;
        }

        public String getOs() {
            return os;
        }

        public Builder setOs(String os) {
            this.os = os;
            return this;
        }

        public String getDisplay() {
            return display;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        //Builder类提供一个外部类的创建方法
        public Computer build() {
            return new Computer(this);
        }
    }

}
