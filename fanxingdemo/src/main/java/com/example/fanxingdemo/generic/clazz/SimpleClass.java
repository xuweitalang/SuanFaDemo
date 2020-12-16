package com.example.fanxingdemo.generic.clazz;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 13:39
 * @Description: 泛型类定义如下：
 * class name<T1,T2,...,Tn>{
 * ...
 * }
 * <p>
 * 在类名之后的 <> 尖括号，称之为类型参数(类型变量)，定义一个泛型类就是使用 <> 给它定义类型参数：T1、T2 ... Tn。
 */
public class SimpleClass<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
