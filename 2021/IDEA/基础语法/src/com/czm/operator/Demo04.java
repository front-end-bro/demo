package com.czm.operator;

public class Demo04 {
    public static void main(String[] args) {
        //++     --     自增，自减  一元运算符
        int a=3;

        int b =a++;  //执行完这行代码后,先给b赋值，再自增
        //a=a+1
        System.out.println(a);
        //=a+1
        int c=++a;  //执行完这行代码前,先自增，再给c赋值

        System.out.println(a);
        System.out.println(b);//先给b赋值，再自增 所以是3
        System.out.println(c);//先自增，再给c赋值 所以是5
        System.out.println("================================");


        //幂运算 2^3   2*2*2 = 8  很多运算，会使用一些工具来操作！
        double pow = Math.pow(2,3);
        System.out.println(pow);
    }
}
