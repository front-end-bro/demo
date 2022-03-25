package com.oop.demo05;
//在Java中，所有的类，都默认直接或间接继承Object
//Person 人 ：父类
public class Person {
    public Person(){
        System.out.println("Person无参执行");
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    //public 公共的
    //protected 受保护的
    //default 默认的
    //private 私有的
    private int money=10_0000_0000;
    public void say(){

        System.out.println("说了一句话");

    }
    protected String name ="ac";
    public void print(){
        System.out.println("Person");
    }
    //私有的类可以被继承 但只能本类访问
}
