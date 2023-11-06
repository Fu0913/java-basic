package com.briup.day04;

import java.util.Scanner;

public class Test02_Switch {

    //定义方法，判断年份是否为闰年
    public static boolean isYear(int year) {
        if((year % 400 == 0) ||
                (year % 4 == 0) && (year % 100 != 0))
            return true;

        return false;
    }

    //从键盘录入一个年份和月份，然后输出该月份的天数
    public static void main(String[] args) {
       //1-12
       //31:    1 3 5 7 8 10 12
       //30:    4 6 9 11
       //28|29: 2

        //1.从键盘获取年份 月份
        Scanner sc = new Scanner(System.in);
        System.out.println("input year and month: ");

        int year = sc.nextInt();
        int month = sc.nextInt();

        //2.具体分支实现
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
            case 2:
                //判断是否为闰年
//                if((year % 400 == 0) ||
//                        (year % 4 == 0) && (year % 100 != 0)) {
//                    System.out.println("29天");
//                }else {
//                    System.out.println("28天");
//                }

                //方法的调用
                boolean f = isYear(year);
                if(f)
                    System.out.println("29天");
                else
                    System.out.println("28天");
                break;
            default:
                System.out.println("录入月份有误");
                break;
        }
    }

    //基础语法
    public static void main01(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a mode(0 1 2 3): ");
        int mode = sc.nextInt();

        switch(mode){
            case 0:
                System.out.println("默认模式开启");
                //注意讲解break用法：结束switch语句
                //break;
            case 1:
                System.out.println("1模式开启");
                break;
            case 2:
                System.out.println("2模式开启");
                break;
            case 3:
                System.out.println("3模式开启");
                break;
            default:
                System.out.println("无效录入");
                //break;
        }

        System.out.println("main end!");
    }
}
