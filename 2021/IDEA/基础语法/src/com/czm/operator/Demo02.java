package com.czm.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a = 123123213213123L;
        int b =123;
        short c =10;
        byte d =8;

        System.out.println(a+b+c+d); //Long
        System.out.println(b+c+d); //Int
        System.out.println(c+d); //Int
        //System.out.println((String) (c+d)); //Int 自动升级为混合运算类型中最高类型
        //类型转换：byte、short、char用运算符运算后自动转换为Int
    }
}
