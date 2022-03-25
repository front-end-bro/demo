package com.czm.struct;

import java.util.Scanner;

public class IfDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        if 语句至多有一个 else 语句，else 语句在所有的 else if 语句之后
        if 语句可以有若干个 else if 语句，它们必须在 else 语句之前
        一旦有一个 else if 语句检测为 ture，其他的 else if 以及 else 语句都将跳过执行
         */

        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        if (score==100){
            System.out.println("恭喜满分");
        }else if (score<100 && score>=90){
            System.out.println("A");
        }else if (score<90 && score>=80){
            System.out.println("B");
        }else if (score<80 && score>=70){
            System.out.println("C");
        }else if (score<70 && score>=60){
            System.out.println("D");
        }else if (score<60 && score>=0){
            System.out.println("不及格");
        }else {
            System.out.println("成绩不合法");
        }













        scanner.close();
    }
}
