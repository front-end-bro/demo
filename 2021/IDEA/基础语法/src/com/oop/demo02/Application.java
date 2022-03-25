package com.oop.demo02;
//一个项目应该只存在一个main方法
// 写了有参 无参就没了
public class Application {
    public static void main(String[] args) {
        //new 实例化一个对象
        Person person = new Person("at",17);

        System.out.println(person.name);
        System.out.println(person.age);
        //new 实例化一个对象


    }
}
