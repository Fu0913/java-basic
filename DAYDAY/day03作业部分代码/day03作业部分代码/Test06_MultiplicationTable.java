package com.briup.day03;

/**
 * @ClassName: Test06_MultiplicationTable
 * @Description: 打印九九乘法表
 * @Author: songjl
 * @Date: 2023/10/10 17:26
 * @Version: v1.0
 */
public class Test06_MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            // 被乘数
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j * i)+"\t");
            }
            System.out.println();
        }
    }
}
