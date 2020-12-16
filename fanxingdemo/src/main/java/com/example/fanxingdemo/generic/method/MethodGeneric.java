package com.example.fanxingdemo.generic.method;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 14:33
 * @Description: 泛型方法
 * 泛型方法使用了类型参数的方法，泛型方法比较独立，可以声明在 普通类、泛型类、普通接口、泛型接口中。
 * 泛型方法定义格式，如下：
 * public <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2)
 */
public class MethodGeneric {

    //定义一个泛型方法
    public <T> T genericMethod(T... t) {
        return t[t.length / 2];
    }

    public static void main(String[] args) {
        MethodGeneric methodGeneric = new MethodGeneric();
        String res = methodGeneric.genericMethod("java", "dart", "kotlin");
        System.out.println(res);
    }
}
