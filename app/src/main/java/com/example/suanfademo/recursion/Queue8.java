package com.example.suanfademo.recursion;

import android.media.audiofx.AcousticEchoCanceler;

/**
 * @Author: xuwei
 * @Date: 2020/12/13 13:57
 * @Description: 8皇后问题(回溯算法的经典案例):
 * 就是在一个8*8格的国际象棋上摆放8个皇后，使其不能互相攻击，即：
 * 任意两个皇后都不能处于同一行、同一列、同一斜线上，计算出有多少种 摆放方法
 */
public class Queue8 {
    //定义一个max,表示有多少个皇后
    int max = 8;
    //定义一个数组，表示皇后摆放的位置，比如 arr = {0,4,7,5,2,6,1,3}
    int[] arr = new int[max];
    static int count = 0; //符合摆放要求的个数

    public static void main(String[] args) {
        Queue8 queue8 = new Queue8();
        queue8.check(0);
        System.out.printf("一共有 %d 种摆放方法", count);
    }

    /**
     * 将皇后摆放的位置输出
     */
    private void print() {
        count++;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    /**
     * 查看当放置第n个皇后时，就去检测该皇后是否和前面已经摆放的皇后冲突
     *
     * @param n 表示第n个皇后，n从0开始
     * @return
     */
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            /**
             * arr[i] == arr[n] 表示判断 第n个皇后是否和前面的n-1个皇后在同一列
             * Math.abs(n - i) == Math.abs(arr[n] - arr[i]) ：判断第n个皇后是否和第i个皇后在同一斜线
             */
            if (arr[i] == arr[n] || Math.abs(n - i) == Math.abs(arr[n] - arr[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * 放置第n个皇后
     *
     * @param n 从0开始
     */
    private void check(int n) {
        if (n == max) { //表示皇后已经放置好了
            print();
            return;
        }
        //依次放置皇后，并判断冲突
        for (int i = 0; i < max; i++) {
            //先把当前这个皇后n，让到该行的第1列
            arr[n] = i;
            //判断当放置第n个皇后到i列时，是否冲突
            if (judge(n)) { //不冲突
                //接着放n+1个皇后，递归调用
                check(n + 1);
            }
            //如果冲突，就继续下一个循环，就是将第n个皇后放置在本行的下一个位置
        }
    }
}
