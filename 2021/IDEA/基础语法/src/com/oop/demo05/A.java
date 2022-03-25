package com.oop.demo05;
//继承
public class A extends B{
    public static void test(){
        System.out.println("A=>test()");
    }
    //Override 重写
    @Override//注释：有功能的注释！
    public void test1() {
        System.out.println("a=>test1()");
    }
}
