package com.example.fanxingdemo.generic.wildcard.up;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 15:32
 * @Description: 通配符：
 * 上限通配符将未知类型限定为该类型或其子类型，使用 extends 关键字，
 * 而下限通配符将未知类型限定为该类型或其父类型，使用 super 关键字。
 * <p>
 * 上限通配符<? extend T>无法 set 数据，但是可以 get 数据且只能 get 到其上限 T，所以，上限通配符可以安全的访问数据。
 * <p>
 * 下限通配符<? super T>可以且只能 set 其下限 T，也可以 get 数据，但只能用 Object 接收(因为Object是所有类型的父类，这是一个特例)，所以，下限通配符可以安全的写入数据。
 * <p>
 * 所以，在使用上下限通配符时，可以遵循以下准则：
 * 如果你只需要从集合中获得类型T , 使用<? extends T>通配符；
 * 如果你只需要将类型T放到集合中, 使用<? super T>通配符；
 * 如果你既要获取又要放置元素，则不使用任何通配符；
 */
public class FruitPlateGen<Fruit> implements Plate<Fruit> {
    private List<Fruit> fruits = new ArrayList<>(6);

    @Override
    public void set(Fruit fruit) {
        fruits.add(fruit);
    }

    @Override
    public Fruit get() {
        int index = fruits.size() - 1;
        if (index >= 0) return fruits.get(index);
        return null;
    }
}
