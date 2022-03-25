package com.czm.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //练习2：用while 或for循环输出1-1000之间能被5整除的数，并且每行输出3个

        for (int i = 0; i <= 1000; i++) {
            if (i%5==0){
                System.out.print(i+"\t");//"\t" Tab键
            }
            if (i%(5*3)==0){//每行输出三个
                System.out.println();
                //System.out.print("\n");//"\n"换行
            }

        }

        //println 输出完会换行
        //print 输出完不会换行
        System.out.println("===========================");
        int a=0;

        while (a<=1000){
            if (a%5==0){
                System.out.print(a+"\t");
            }a++;
            if (a%(5*3)==0){
                System.out.println();
            }

        }

    }
}
