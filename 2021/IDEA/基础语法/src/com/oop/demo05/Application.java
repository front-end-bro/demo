package com.oop.demo05;

import com.czm.method.test;

public class Application {
    //静态方法和非静态方法的区别很大
    //静态方法：方法的调用只和左边定义的数据类型有关
    //非静态：重写
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("===================");
        student.say();
        System.out.println(student.getMoney());

        System.out.println("==========================");
        student.test("阿菜");
        student.test1();

        System.out.println("==================================");
        System.out.println("方法重写");

        //方法的调用只和左边定义的数据类型有关
        A a =new A();
        a.test();


        //父类的引用指向了子类
        B b =new A();
        b.test();


        a.test1();
        b.test1();//子类重写了父类的方法
    }
}
