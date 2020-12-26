package com.example.fanxingdemo.fanxing.generic.method;

import androidx.annotation.NonNull;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 14:44
 * @Description: 泛型方法示例
 */
public class MethodGeneric2 {

    static class Fruit {
        @NonNull
        @Override
        public String toString() {
            return "fruit";
        }
    }

    static class Apple extends Fruit {
        @NonNull
        @Override
        public String toString() {
            return "apple";
        }
    }

    static class Person {
        @NonNull
        @Override
        public String toString() {
            return "person";
        }
    }

    //定义泛型类
    static class ShowClass<T> {
        //定义了普通方法
        public void show1(T t) {
            System.out.println(t.toString());
        }

        //定义了泛型方法
        public <E> void show2(E e) {
            System.out.println(e.toString());
        }

        /**
         * 定义了泛型方法
         * 在泛型类中定义泛型方法时，需要注意，泛型类里的泛型参数 <T> 和泛型方法里的泛型参数 <T> 不是同一个。
         *
         * @param <T>
         */
        public <T> void show3(T t) {
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Person person = new Person();
        ShowClass<Fruit> showClass = new ShowClass<>();
        showClass.show1(apple);
//        showClass.show1(person); //编译报错，因为 ShowClass<Fruit> 已经限定类型

        showClass.show2(apple);  //可以放入，泛型方法 <E> 可以是任何非基本类型
        showClass.show2(person); //可以放入，泛型方法 <E> 可以是任何非基本类型

        showClass.show3(apple); //可以放入，泛型方法 <T> 和泛型类中的 <T> 不是同一条 T，可以是任何非基本类型
        showClass.show3(person);//可以放入，泛型方法 <T> 和泛型类中的 <T> 不是同一条 T，可以是任何非基本类型
    }
}
