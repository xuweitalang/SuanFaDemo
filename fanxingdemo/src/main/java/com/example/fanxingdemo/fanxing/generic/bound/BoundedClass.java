package com.example.fanxingdemo.fanxing.generic.bound;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 14:59
 * @Description: 限定类型参数的泛型类
 * 限定类型参数：要声明一个限定的类型参数，需要在参数类型后加上 extends 关键字，然后是其上限类型(类或接口)。
 */
public class BoundedClass<T extends Comparable> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T min(T outer) {
        if (t.compareTo(outer) > 0) {
            return outer;
        } else {
            return t;
        }
    }

    public static void main(String[] args) {
        BoundedClass<String> stringBoundedClass = new BoundedClass<>();
        stringBoundedClass.setT("android");
        String min = stringBoundedClass.min("ios");
        System.out.println(min);

        BoundedClass<Integer> integerBoundedClass = new BoundedClass<>();
        integerBoundedClass.setT(10);
        int min2 = integerBoundedClass.min(20);
        System.out.println(min2);
    }
}
