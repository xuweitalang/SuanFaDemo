package com.example.fanxingdemo.fanxing.generic.bound;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 15:13
 * @Description: 多重限定：限定类型参数，也可以为多个限定，如：
 * <T extends B1 & B2 & B3>
 * <p>
 * 多个限定参数，如果其中有类，类必须放在第一个位置。
 */
public class D<T extends C & A & B> {
}

interface A {

}

interface B {

}

class C {

}