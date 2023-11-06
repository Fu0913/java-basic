package com.briup.day03;

import java.util.Scanner;

/**
 * @ClassName: Test09_DayOfYear
 * @Description: 请编写⼀个Java程序，实现从键盘中输⼊年份 ⽉份 ⽇期，输出这⼀天是该年的第⼏天
 * @Author: songjl
 * @Date: 2023/10/10 17:28
 * @Version: v1.0
 */
public class Test09_DayOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份 ⽉份 ⽇期：");
        int year = scanner.nextInt();
        // System.out.println("year = " + year);
        int month = scanner.nextInt();
        // System.out.println("month = " + month);
        int day = scanner.nextInt();
        // System.out.println("day = " + day);

        // 2023 04 27
        for (int i = 1; i < month; i++) {
            if (i == 2) {
                if ((year % 4 == 0 && year % 100 != 0) ||
                        year % 400 == 0) {
                    day += 29;
                }else {
                    day += 28;
                }
            }else if (i == 4 || i == 6 || i == 9 || i == 11) {
                day += 30;
            }else {
                day += 31;
            }
        }

        System.out.println(day);
    }
}
