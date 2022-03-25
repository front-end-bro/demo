package com.oop.demo06;

public class Application {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        //new Student();
        //new Person();

        //可以指向的引用类型就不确定了:父类的引用指向子类
        //Student 能调用的方法都是自己的或者是继承父类的
        Student s1 = new Student();
        //Person 父类型，可以指向子类，但是不能调用子类独有的方法
        Person s2 = new Student();
        Object s3 = new Student();

        //对象能执行的哪些方法，主要看对象的类型
        s2.run();//子类重写了父类的方法，执行子类的方法
        s1.run();

        ((Student) s2).eat();//强制转换
    }
}
