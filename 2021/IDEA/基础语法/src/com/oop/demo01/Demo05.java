package com.oop.demo01;
//引用传递：对象，本质还是值传递
//引用传递(pass by reference)是指在调用方法时将实际参数的地址直接传给方法，
// 这样在方法中对参数进行修改将会影响到参数
//对象，内存

public class Demo05 {
    public static void main(String[] args) {
        lxl lxl = new lxl();
        System.out.println(lxl.name);//null
        Demo05.pig(lxl);
        System.out.println(lxl.name);
    }
    public static void pig(lxl lxl){
        //lxl是一个对象：指向的lxl lxl = new lxl();这是具体的lxl，可以改变属性
        lxl.name="pig";
    }

}
//定义了一个牛小馁类，有一个属性：name
class  lxl{
    String name;//null
}