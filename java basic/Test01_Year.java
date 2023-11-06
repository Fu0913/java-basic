package com.briup.day04;

//1.
import java.util.Scanner;

public class Test01_Year {

    //课堂联系：水仙花数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a num(100-999): ");
        int i = sc.nextInt();

        int g, s, b;
        // 257
        // 1.拆分个、十、百位数
        g = i % 10;
        s = i / 10 % 10;
        b = i / 100;

        // 2.判断立方和 是否 等于自己
        if (i == g * g * g + s * s * s + b * b * b) {
            System.out.println("水仙花数: " + i);
        }else {
            System.out.println(i + " 不是水仙花数");
        }

    }

    //课堂练习：if格式3
    public static void main04(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a hour: ");
        int hour = sc.nextInt();

        String message;

        if (hour >= 8 && hour < 12) {
            message = "早上好";
        } else if (hour >= 12 && hour < 14) {
            message = "中午好";
        } else if (hour >= 14 && hour < 18) {
            message = "下午好";
        } else {
            message = "晚上好";
        }

        System.out.println(message);
    }

    //if格式3
    public static void main03(String[] args) {
        //2.
        Scanner sc = new Scanner(System.in);
        System.out.println("input a score: ");

        //3.
        int score = sc.nextInt();

        //4.输出对应的等级
        if(score >= 90 && score <= 100) {
            System.out.println("优秀");
        }else if(score >= 80 && score < 90) {
            System.out.println("良好");
        }else if(score >= 70 && score < 80) {
            System.out.println("中等");
        }else if(score >= 60 && score < 70) {
            System.out.println("及格");
        }else if(score >= 0 && score < 60) {
            System.out.println("不及格");
        }else {
            System.out.println("分数无效");
        }

        System.out.println("main end.");
    }

    //&& 优先级高于 ||
    public static void main02(String[] args) {
        //2.
        Scanner sc = new Scanner(System.in);
        System.out.println("input a year: ");

        //3.
        int year = sc.nextInt();

        //4.判断是否为闰年并输出
        //4年闰 百年不闰 四百年闰
        // 2012  2100
        if((year % 400 == 0) ||
                (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " 是闰年");
        }else {
            System.out.println(year + " 不是闰年");
        }

        System.out.println("main end...");
    }

    //if判断输出是否闰年
    public static void main01(String[] args) {
        //2.
        Scanner sc = new Scanner(System.in);
        System.out.println("input a year: ");

        //3.
        int year = sc.nextInt();

        //4.判断是否为闰年并输出
        //4年闰 百年不闰 四百年闰
        // 2012  2100
        if(((year % 4 == 0) && (year % 100 != 0))
                || (year % 400 == 0)) {
            System.out.println(year + " 是闰年");
        }else {
            System.out.println(year + " 不是闰年");
        }

        System.out.println("main end...");
    }
}
