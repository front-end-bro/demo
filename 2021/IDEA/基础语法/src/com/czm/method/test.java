package com.czm.method;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数值");
        while (scanner.hasNextDouble()){
            double a = scanner.nextDouble();
            System.out.println("请输入一个操作符");
            String str = scanner.next();
            System.out.println("请输入第二个数值");
            double b = scanner.nextDouble();
            switch (str){
                case "+":
                    add(a,b);
                    break;
                case "-":
                    minus(a,b);
                    break;
                case "*":
                    multiply(a,b);
                    break;
                case "/":
                    except(a,b);
            }
            System.out.println("输入任意字母结束");
        }
        scanner.close();
        System.out.println("Thank");
    }
    public static void add(double num1,double num2){
        System.out.println(num1+num2);
    }
    public  static  void minus(double num1,double num2){
        System.out.println(num1-num2);
    }
    public  static  void multiply(double num1,double num2){
        System.out.println(num1*num2);
    } public  static  void except(double num1,double num2){

        if (num2 ==0){
            System.out.println("分母不能为0");
        }else
            System.out.println(num1/num2);
    }
}
