package com.czm.base;

public class Demo03 {
    public static void main(String[] args) {
        //整数拓展      进制      二进制0b     十进制     八进制0     十六进制0x

        int i=10;
        int i2=010; //八进制0
        int i3=0x10; //0~9 A~F 十六进制

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("============================");
        //=================================================
        //  浮点数拓展？ 银行业务怎么表示？ 钱
        //BigDecimal  数学工具类
        //=================================================

        //float     有限      离散      舍入误差        大约      接近但不等于
        //double
        //最好完全避免使用浮点数进行比较

        float f=0.1f; //0.1
        double d = 1.0/10; //0.1

        System.out.println(f==d);//判断f和d是否一样

        float d1=30032111111111111111f;
        float d2=d1+1;
        System.out.println(d1==d2);//true

        //======================================
        //字符拓展
        //=====================================================
        System.out.println("=============================================================");

        char c1='A';
        char c2='d';

        System.out.println(c1);

        System.out.println((int)c1);//强制换行

        System.out.println(c2);

        System.out.println((int)c2);//强制换行

        //所有的字符本质还是数字
        //编码 Unicode 表：(97=a 65=A) 2字节 0 - 65536 Excel   2 16 = 65536
        //U0000  UFFF

        char c3 ='\u0061';
        System.out.println(c3); //a

        //转义字符
        // \t 空格
        // \n 换行

        System.out.println("Hello\tWorld");

        System.out.println("==========================");
        String sa= new String("hello");
        String sb= new String("hello");
        System.out.println(sa==sb);

        String sc="hello";
        String sd="hello";
        System.out.println(sc==sd);
        //对象  从内存分析

        //布尔值拓展
        boolean flag = true;
        if(flag==true){} //新手
        if (flag){}  //老手
        //Less is More!     代码要精简易读

    }
}
