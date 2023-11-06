package com.briup.day03;

import java.util.Scanner;

/**
 * @ClassName: Test08_Season
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/10 17:27
 * @Version: v1.0
 */
public class Test08_Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输⼊⼀个⽉份：");
        // 请继续向下补全代码
        int month = sc.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            default:
                System.out.println("输入的月份有误");
                break;
        }
    }
}
