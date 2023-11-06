package com.briup.day03;

import java.util.Scanner;

/**
 * @ClassName: Test10_PerfectNumber
 * @Description: 完全数问题
 * @Author: songjl
 * @Date: 2023/10/10 17:29
 * @Version: v1.0
 */
public class Test10_PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = scanner.nextInt();

        int sum = 0; // 所有因数的和
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                // i是num的因数
                sum += i;
            }
        }

        if (num == sum) {
            System.out.println(num + "是完全数");
        }else {
            System.out.println(num + "不是完全数");
        }
    }
}
