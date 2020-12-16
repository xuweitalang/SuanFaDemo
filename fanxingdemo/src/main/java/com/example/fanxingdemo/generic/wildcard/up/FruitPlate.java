package com.example.fanxingdemo.generic.wildcard.up;

import com.example.fanxingdemo.generic.method.MethodGeneric2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 15:30
 * @Description: 水果盘
 */
public class FruitPlate implements Plate {
    private List items = new ArrayList(6);

    @Override
    public void set(Object o) {
        items.add(o);
    }

    @Override
    public Fruit get() {
        int index = items.size() - 1;
        if (index >= 0) return (Fruit) items.get(index);
        return null;
    }
}
