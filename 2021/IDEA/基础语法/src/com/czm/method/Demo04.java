package com.czm.method;

public class Demo04 {
    public static void main(String[] args) {
        printMax(34,22,2233,3421,1112,21200.2);
        printMax(new double[]{1,2,2,3,34,5,55});

    }


    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("没有");
            return;//终止程序
        }
        double result =numbers[0];

        for (int i =1;i<numbers.length;i++){
            if (numbers[i]>result){
                result = numbers[i];
            }
        }
        System.out.println("最大值为"+ result);
    }
}
