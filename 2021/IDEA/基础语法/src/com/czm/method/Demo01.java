package com.czm.method;
public class Demo01 {
    //main 方法
    public static void main(String[] args) {
        //实际参数：实际调用传递给他的参数
        int sum = add(1, 2);
        System.out.println(sum);
        test();
    }
    //加法
    //形式参数，用来定义作用的
    public static int add(int a, int b) {
        return a + b;
    }

    public static void test() {
        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");//"\t" Tab键
            }
            if (i % (5 * 3) == 0) {//每行输出三个
                System.out.println();
                //System.out.print("\n");//"\n"换行
            }
        }
    }

}