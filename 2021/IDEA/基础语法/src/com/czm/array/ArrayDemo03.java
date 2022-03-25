package com.czm.array;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int [] arrays ={1,2,3,4,5};

        //打印所有数组元素
        for (int i=0;i<arrays.length;i++){
            System.out.println(arrays[i]);
        }
        System.out.println("=========================");
        //计算所有元素的和
        int sum=0;
        for (int i = 0; i < arrays.length; i++) {
            sum +=arrays[i];

        }
        System.out.println("所有元素的和为"+sum);
        System.out.println("==================");
        //查找最大元素
        int max =arrays[0];
        for (int i = 1; i <arrays.length ; i++) {
            if (arrays[i]>max){
                max =arrays[i];
            }
        }System.out.println("max="+max);
    }
}