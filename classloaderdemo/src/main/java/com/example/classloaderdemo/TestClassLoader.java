package com.example.classloaderdemo;

import java.lang.reflect.Method;

/**
 * @Author: xuwei
 * @Date: 2021/1/15 10:27
 * @Description:
 */
public class TestClassLoader {
    public static void main(String[] args) {
        DiskClassLoader diskClassLoader = new DiskClassLoader("file:///d/JavaSpace/SuanFaDemo/classloaderdemo/src/main/java/com/example/classloaderdemo/");
        try {
            Class clazz = diskClassLoader.loadClass("Secret");
            if (clazz != null) {
                Object obj = clazz.newInstance();
                //通过反射调用Secret的printSecret方法
                Method method = clazz.getDeclaredMethod("printSecret", null);
                method.invoke(obj, null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
