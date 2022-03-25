package com.czm.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name ="ac";
        //JDK7的新特性，表达式的结果可以是字符串
        //字符的本质还是数字

        //反编译  java---class (字节码文件) ---反编译 (IDEA)
        switch (name){
            case "ac":
                System.out.println("ac");
                break;
            case "czm":
                System.out.println("czm");
                break;
            default:
                System.out.println("do what?");

        }

    }

}
