package com.oop.demo01;
//值传递
// 值传递(pass by value)是指在调用方法时将实际参数复制一份传给方法，
// 这样在方法中对参数进行修改将不会影响到参数

public class Demo04 {
    public static void main(String[] args) {
    int a=1;
        System.out.println(a);//1
        Demo04.change(a);
        System.out.println(a);//1
    }
    //返回值为空 形参不改变实参的值
    public static void change(int a){
        a=10;

    }

}
