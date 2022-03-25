package com.oop.demo01;

public class Demo02 {
    //静态方法 static
    public static void main(String[] args) {
        Student.say();

        //实例化sleep这个类 new
        //new Student(); 然后Alt+Enter
        //对象类型 对象名  = 对象值
        Student student = new Student();
        student.sleep();

        System.out.println("======================");
        //实例化sleep这个类 new
        new Student().sleep();
    }
}
