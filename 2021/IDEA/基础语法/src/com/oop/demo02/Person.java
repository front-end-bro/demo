package com.oop.demo02;
//java ---> class
public class Person {
    //一个类什么也不写 也会存在一个方法
    //显示的定义构造器

    String name;
        int age;



    //实例化初始值
    //1.使用new关键字 本质实在调用构造器
    //2.用来初始化值
    //无参构造
    public Person(){
        this.name="a";
    }

    //有参构造：一旦定义了有参构造，无参构造必须显示定义
    public Person(String name){
      //this.name：代表对象本身的name
      // name:上面的String name
        this.name=name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Atl+insert
    
}
/*
public static void main(String[] args) {
        //new 实例化一个对象
        Person person = new Person("aaaa");

        System.out.println(person.name);
    }


    构造器：
        1.和类名相同
        2.没有返回值
    作用：
        1.new 本质在调用构造方法
        2.初始化对象的值
    注意点：
        1.定义有参构造后，如果想用无参构造，显示的定义一个无参的构造



*/