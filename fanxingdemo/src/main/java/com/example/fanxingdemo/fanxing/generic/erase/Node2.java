package com.example.fanxingdemo.fanxing.generic.erase;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 16:05
 * @Description: 有界的泛型类
 */
public class Node2<T extends Comparable> {
    private T data;
    private Node2<T> next;

    public Node2(T data, Node2<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }
}

/*
Java 编译器将类型参数替换为第一个边界 Comparable，如下：

public class Node2 {
  private Comparable data;
  private Node2 next;
  public Node2(Comparable data, Node2 next) {
    this.data = data;
    this.next = next;
  }
  public Comparable getData() {
    return data;
  }
}

 */
