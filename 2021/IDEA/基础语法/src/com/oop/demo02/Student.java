package com.oop.demo02;

public class Student{
        //属性：字段
        String name;//null
        int age;//0

        //方法
        public void study(){
                System.out.println(this.name+"在学习");
        }

        }
/*
*  //类：抽象的，需要实例化
        //类实例化后会返回一个自己的对象！
        //student对象就是一个Student类的具体实例
        Student a = new Student();
        Student b = new Student();

        a.name="啊";
        b.name="be";
        a.age=17;
        b.age=18;
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(b.name);
        System.out.println(b.age);
 */