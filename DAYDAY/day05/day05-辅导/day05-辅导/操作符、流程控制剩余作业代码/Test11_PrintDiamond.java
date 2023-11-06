package com.briup.day03;

/**
 * @ClassName: Test11_PrintDiamond
 * @Description: 图形输出
 * @Author: songjl
 * @Date: 2023/10/10 17:29
 * @Version: v1.0
 */
public class Test11_PrintDiamond {
    public static void main(String[] args) {
        // 上半部分

        for (int i = 1; i <= 4; i++) {
            // i代表行数
            /*
                空格：1 3    2 2    3 1    4 0
             */
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            /*
                *： 1 1   2 3   3 5   4  7
                n   2 * i - 1
             */
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            /*
                空格： 1 1  2 2  3 3
             */
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            /*
                * 1 5 2 * (4-1) - 1
                * 2 3 2 * (4-2) - 1
                * 3 1 2 * (4-3) - 1
                * n   2 * (4-n) - 1 = 7 - 2 * n
             */
            for (int j = 1; j <= 7 - 2 * i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
