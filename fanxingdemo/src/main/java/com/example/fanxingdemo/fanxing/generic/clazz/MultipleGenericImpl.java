package com.example.fanxingdemo.fanxing.generic.clazz;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 13:47
 * @Description: 泛型类可以有多个类型参数定义
 */
public class MultipleGenericImpl<K, V> implements MultipleGeneric<K, V> {
    private K key;
    private V value;

    public MultipleGenericImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        MultipleGeneric<String, Integer> m1 = new MultipleGenericImpl<>("haha", 100);
        System.out.println("key:" + m1.getKey() + ", value:" + m1.getValue());
    }
}
