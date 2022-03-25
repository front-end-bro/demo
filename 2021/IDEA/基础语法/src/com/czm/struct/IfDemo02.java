package com.czm.struct;

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：");
        int score =scanner.nextInt();

        if (score>=60){
            System.out.println("及格"+score);
        }else {
            System.out.println("不及格"+score);
        }

        scanner.close();
    }
}
