package com.briup.day03;

/**
 * @ClassName: Test07_PrimeNumber
 * @Description: 请编写⼀个Java程序，判断101-200之间有多少个素数，并输出所有素数
 * @Author: songjl
 * @Date: 2023/10/10 17:26
 * @Version: v1.0
 */
public class Test07_PrimeNumber {
    public static void main(String[] args) {
        // 101 - 200 的素数
        /*
            101 % 2 3 4 …… 100

            100

            100
            2 50
            4 25
            5 20
            10 10
            20 5
         */
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean isPrime = true;

            // for (int j = 2; j < i; j++) {
            //     if (i % j == 0) {
            //         // 不是素数
            //         isPrime = false;
            //         break;
            //     }
            // }

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    // 不是素数
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n一共有" + count + "个素数");
    }
}
