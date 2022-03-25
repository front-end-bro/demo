package com.oop.demo04;
/*封装特点:
1.提高程序的安全性，保护数据
2.隐藏代码的实现细节
3.统一接口
4.系统可维护增加了

属性私有 get/set

 */

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("czm");

        //方法名，参数列表 判断方法是否相同
        System.out.println(s1.getName());
        s1.setAge(1000);
        System.out.println(s1.getAge());
    }
}
