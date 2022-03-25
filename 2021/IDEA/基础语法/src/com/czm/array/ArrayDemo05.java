package com.czm.array;

public class ArrayDemo05 {
    public static void main(String[] args) {

        //[3][2] 面向对象
//        1,2   array[0][0],array[0][1]
//        1,2   array[1][0],array[1][1]
//        3,1   array[2][0],array[2][1]
        //二维数组
        int[][] array = {{1,2},{1,2},{3,1}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);

            }
            
        }

    }

    //打印数组元素
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");

        }

    }
}
