package com.example.fanxingdemo.generic.bound;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 15:05
 * @Description: 限定类型参数的泛型方法
 */
public class BoundedGeneric {

    public static <T extends Comparable> T min(T a, T b) {
        if (a.compareTo(b) < 0)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println(min(50, 15));

        System.out.println(min("hehe","good"));
    }
}
