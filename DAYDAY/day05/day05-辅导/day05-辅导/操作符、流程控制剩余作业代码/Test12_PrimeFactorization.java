package com.briup.day03;

import java.util.Scanner;

/**
 * @ClassName: Test12_PrimeFactorization
 * @Description: 分解质因数
 * @Author: songjl
 * @Date: 2023/10/10 17:30
 * @Version: v1.0
 */
public class Test12_PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输⼊⼀个15以内的正整数：");
        int num = scanner.nextInt();
        if (num > 15 || num <= 0) {
            System.out.println("输入的数据不合法");
            return;
        }
        System.out.print(num + "=");
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i);
                num /= i;

                if (num != 1) {
                    System.out.print("*");
                }
            }
        }
    }
}
