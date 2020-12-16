package com.example.fanxingdemo.generic.erase;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 16:12
 * @Description: 泛型方法的擦除
 */
public class MethodErase {

    public static <T> void count(T[] anArray, T ele) {
        int cou = 0;
        for (T e : anArray) {
        }
    }


    /*

    Java 编译器同样会擦除泛型方法中的类型参数，例如：
    public static int count(Object[] anArray, Object elem) {
        int cnt = 0;
        for (Object e : anArray) {
        }
    }

     */
}
