package com.czm.array;

public class ArrayDemo08 {
    public static void main(String[] args) {
        //1.创建一个二维数组 11*11  0：没有棋子 1：黑棋  2：白棋
        int [][] array1=new int[11][11];
        array1[1][2]=1;
        array1[2][3]=2;
        //输出原始的数组
        System.out.println("输出原始数组");
        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }//详见：struct包中的ForDemo5的遍历数组
        System.out.println("==========================");
        //转换为稀疏数组来储存
        //获取有效值得个数
        int sum=0;
        for (int i = 0; i <11; i++) {
            for (int j = 0; j <11 ; j++) {
                if (array1[i][j]!=0){
                    sum++;
                }
                
            }
        }
        System.out.println("有效值的个数"+sum);

        //2.创建一个稀疏数组的数组
        int[][] array2 =new int[sum+1/*有效值格数加一 第一行是总数行*/][3];
        array2[0][0]=11;//行数
        array2[0][1]=11;//列数
        array2[0][2]=sum;//存储数个数

        //遍历二维数组，将非零的值，存放在稀疏数组中
        int count=0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if(array1[i][j]!=0){
                    count++;
                    array2[count][0]=i;//横坐标
                    array2[count][1]=j;//纵坐标
                    array2[count][2]=array1[i][j];//值
                }

            }

        }
        //输出稀疏数组
        System.out.println("稀疏数组");
        System.out.println("横坐标"+"\t"+
                "纵坐标"+"\t"+
                "值"+"\t");
        for (int i = 0; i < array2.length; i++) {

            System.out.println(array2[i][0]+"\t"+"\t"
            +array2[i][1]+"\t"+"\t"+
                    array2[i][2]+"\t"+"\t");

        }
        System.out.println("=========================");
        //还原稀疏数组
        System.out.println("还原稀疏数组");
        //先读取
        int [][] array3=new int[array2[0][0]][array2[0][1]];

        //给其中元素还原值
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]]= array2[i][2];
        }
        //打印
        System.out.println("输出还原的数组");
        for (int[] ints : array3) {
            for (int anInt:ints){
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }

        }
    }
//稀疏数组：记录有效值