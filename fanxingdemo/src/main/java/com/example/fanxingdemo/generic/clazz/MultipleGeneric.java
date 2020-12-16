package com.example.fanxingdemo.generic.clazz;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 13:43
 * @Description: 泛型的多类型的参数
 */
public interface MultipleGeneric<K, V> {
    public K getKey();

    public V getValue();
}
