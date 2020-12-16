package com.example.fanxingdemo.generic.wildcard.up;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 15:27
 * @Description: 接口
 */
public interface Plate<T> {
    void set(T t);

    T get();
}
