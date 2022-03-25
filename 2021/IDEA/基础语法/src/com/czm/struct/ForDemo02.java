package com.czm.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //练习1：计算0到100之间的奇数和偶数的和
        int oddSum=0; //保存奇数的和
        int evenSum=0;//保存偶数的和
        //初始化条件;//条件判断;迭代
        for (int i = 0; i <= 100; i++) {
            if (i%2!=0){ //奇数
                oddSum+=i;//oddSum = oddSum + i;
        }else { //偶数
                evenSum+=i;//evenSum = evenSum + i
            }

        }

        System.out.println("偶数的和"+evenSum);
        System.out.println("奇数的和"+oddSum);
    }
}
