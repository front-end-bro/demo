package com.czm.struct;

public class SwitchDemo01 {
    public static void main(String[] args) {
        //case穿透 没有break 将会将后续case也一并输出
        // Switch 匹配一个具体的值
        char grade ='B';

        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;//可选
            case 'B':
                System.out.println("良好");
                break;//可选
            case 'C':
                System.out.println("及格");
                break;//可选
            case 'D':
                System.out.println("再接再厉");
                break;//可选
            case 'E':
                System.out.println("挂科");
                break;//可选
            default:
                System.out.println("未知等级");
        }
    }
}
