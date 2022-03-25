package com.czm.struct;

import java.util.Scanner;

public class IfDemo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数值：");
        int a=scanner.nextInt();
        if(a>=0 && a<=100){
            if (a>=0 && a<=50){
                System.out.println("数字在0~50之间");
            }
            if (a>=51 && a<=100){
                System.out.println("数字在51~100之间");




            }
        }
        scanner.close();
    }
}
