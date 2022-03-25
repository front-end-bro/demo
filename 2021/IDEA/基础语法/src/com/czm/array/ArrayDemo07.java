package com.czm.array;

import java.util.Arrays;
//    冒泡排序
//    1.比较数组中，两个相邻的元素，如果第一个比第二个大，我们就交换他们的位置
//    2.每一次比较，都会产生出一个最大，或者最小的数
//    3.下一轮则可少一次排序
//    4。依次循环，直到结束
public class ArrayDemo07 {
    public static void main(String[] args) {
        int [] a={543,234,12,432,4657,32,234};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort(a)));
    }
    public static int[] sort(int[] array){
        //临时变量
        int temp=0;
        //外层循环
        for (int i = 0; i < array.length-1 ; i++) {

            boolean flag =false;

            //内层循环，比较判断两个数，如果第一个数比第二个数小，则交换位置 [j]:第一个数 [j+1]:第二个数
            for (int j = 0; j < array.length-1-i; j++) {
                 if(array[j+1]<array[j]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }
            }
            if (flag==false){
                break;
            }
        }return array;

    }
}
