package com.czm.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int [] arrays={1,2,3,4,5};

        //JDK1.5,没有下标
        for (int array : arrays) {
            System.out.println(array);
        }
        printArray(arrays);
        System.out.println("==========");
        int[]reverse=reverse(arrays);
        printArray(reverse);

    }

    //打印数组元素
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");

        }

    }

    //反转数组
    public static int[] reverse(int[]arrays){
        int[] result=new int[arrays.length];
        //反转的操作
        for (int i = 0,j=result.length-1; i <arrays.length ; i++,j--) {
            result[j]=arrays[i];
        }return result;

    }
}
