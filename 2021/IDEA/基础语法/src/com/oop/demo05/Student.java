package com.oop.demo05;

//学生 is 人 ：派生类，子类
//子类继承父类，就会拥有父类的全部方法
public class Student extends Person{
    //隐藏代码：调用了父类的无参构造
    public Student(){
        super();//调用了父类的构造器，必需要在子类构造器的第一行
        System.out.println("Student无参执行");
    }
private String name="czm";
    public void print(){
        System.out.println("Student");
    }
public void test(String name){
    System.out.println(name);//阿菜
    System.out.println(this.name);//czm
    System.out.println(super.name);//ac
    System.out.println("====================");

}

    public void test1(){
        print();//Student
        this.print();//Student
        super.print();//Person

    }
}
