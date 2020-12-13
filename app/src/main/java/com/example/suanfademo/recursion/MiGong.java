package com.example.suanfademo.recursion;

/**
 * @Author: xuwei
 * @Date: 2020/12/13 12:44
 * @Description: 用递归来实现迷宫
 * 迷宫的为8行7列的二维数组，周围都是墙体
 */
public class MiGong {
    public static void main(String[] args) {
        //定义一个二维数组
        int[][] map = new int[8][7];

        //定义周围墙体，使用1表示墙体
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //定义中间挡板
        map[3][1] = 1;
        map[3][2] = 1;

        System.out.println("地图显示情况：");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        //使用递归回溯找到出口
        setWay(map, 1, 1);

        //输出新的地图，小球走过，并标识过的递归
        System.out.println("小球走过，并标识过的地图的情况：");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 使用递归回溯来给小球找路
     *
     * @param map 表示地图
     * @param i,j 从哪个位置开始找
     * @return 找到了返回true
     * <p>
     * 说明：
     * 1. i,j 表示从哪个位置开始出发（1,1）
     * 2. 如果小球能到map[6][5]位置，表示已经找到，map[6][5]为迷宫的出口
     * 3.约定：当map[i][j] 为0表示该点没有走过，当为1表示墙体，为2表示通路可以走，3表示该点已经走过，但是走不通
     * 4.在走迷宫时，需要确定一个策略，即走的方向优先级 下->右->上->左 ，如果走不通则回溯
     */
    public static boolean setWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) { //出口已经找到
            return true;
        } else {
            if (map[i][j] == 0) { //如果这个点没有走过
                // 按照策略 “下->右->上->左” 走
                map[i][j] = 2; //假定该点可以走通
                if (setWay(map, i + 1, j)) { //向下走
                    return true;
                } else if (setWay(map, i, j + 1)) { //向右走
                    return true;
                } else if (setWay(map, i - 1, j)) { //向上走
                    return true;
                } else if (setWay(map, i, j - 1)) { //向左走
                    return true;
                } else {
                    //如果都走不通，说明是死路
                    map[i][j] = 3;
                    return false;
                }
            } else {//如果map[i][j] != 0,则可能为1,2,3，都不能走
                return false;
            }
        }
    }
}
