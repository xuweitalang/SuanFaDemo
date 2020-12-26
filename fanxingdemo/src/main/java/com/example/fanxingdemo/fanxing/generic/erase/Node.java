package com.example.fanxingdemo.fanxing.generic.erase;

/**
 * @Author: xuwei
 * @Date: 2020/12/16 15:59
 * @Description: 泛型类型的擦除：Java 编译器在擦除过程中，会擦除所有类型参数。
 * 如果类型参数是有界的，则替换为第一个边界，如果是无界的，则替换为 Object。
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }
}

/*
由于类型参数T是无界的，因此，Java 编译器将其替换为 Object，如下：
public class Node {
  private Object data;
  private Node next;
  public Node(Object data, Node next) { this.data = data;
    this.next = next;
  }
  public Object getData() { return data; }
}

 */