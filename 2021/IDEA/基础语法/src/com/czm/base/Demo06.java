package com.czm.base;

public class Demo06 {
    public static void main(String[] args) {
        //操作比较大的数的时候，注意溢出问题
        //JDK新特性，数字间可以用下划线分割
        int money =10_0000_0000;
        int years =20;
        int total = money*years; //-1474836480,计算时溢出
        long total2 = money*years; //默认值是int,转换前已经存在问题


        long total3 = ((long)money)*years; //先把一个数转换成long
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);

        //L    l
    }
}
