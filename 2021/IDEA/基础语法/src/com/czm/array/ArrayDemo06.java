package com.czm.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 44, 54, 22, 31};

        System.out.println(a);//[I@1b6d3586
        //打印数组元素
        //System.out.println(Arrays.toString(a));
        printArrays(a);
        Arrays.sort(a);//数组进行排序；升序
        System.out.println(Arrays.toString(a));


        Arrays.fill(a,2,5,0);//数组填充
        System.out.println(Arrays.toString(a));
    }

    public static void printArrays(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == a.length-1) {
                System.out.print(a[i] + "]");
            } else {
                System.out.print(a[i] + ","+" ");

            }

        }
    }
}
