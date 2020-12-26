package com.example.fanxingdemo.fanxing.generic.clazz;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 14:25
 * @Description: 泛型接口使用
 * 实现泛型接口的两种方式：
 * 1.不指定确切的类型参数
 * 2.指定类型参数
 */
public interface Generator<T> {
    public T next();
}

/**
 * 实现泛型接口方式1：不指定确切的类型参数
 *
 * @param <T>
 */
class GeneratorImpl<T> implements Generator<T> {

    @Override
    public T next() {
        return null;
    }
}

/**
 * 实现泛型接口方式2：指定确切的类型参数，这里指定为String
 */
class GeneratorImpl2 implements Generator<String> {

    @Override
    public String next() {
        return null;
    }
}
