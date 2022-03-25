package com.czm.Scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //输入多个数字，并求平均值，每输入一个数字用回车确认，通过非数字来结束输入并输出执行结果；
        Scanner scanner = new Scanner(System.in);


        //和
        double sum=0;
        //计算输入了多少个数字
        int m=0;
        System.out.println("请输入数据：");
        //通过循环判断是否还有输入，并在里面对每一次进行求和和统计
        while (scanner.hasNextDouble()){
            double x=scanner.nextDouble();
            m = m+1;//m++
            sum=sum+x;
            System.out.println("你输入了第"+m+"个数据，然后当前结果是sum="+sum);
        }

        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的品均值是"+(sum/m));

        scanner.close();


    }


}
