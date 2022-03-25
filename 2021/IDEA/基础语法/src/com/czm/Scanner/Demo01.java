package com.czm.Scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        //创造一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接受");

        //判断用户有无输入字符串
        if (scanner.hasNext()){
            //使用next方法接收
            String str =scanner.next();//程序会等待用户输入完毕
            System.out.println("输入的内容为："+str   );
        }
        //凡是属于IO流的类如果不关闭就会一直占用资源，养成习惯用完就关；
        scanner.close();





    }
}
