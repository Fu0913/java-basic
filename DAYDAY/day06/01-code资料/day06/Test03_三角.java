package com.briup.day06;

import java.util.Arrays;
import java.util.Scanner;

public class Test03_三角 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入行数: ");
        int len = sc.nextInt();

        //1.定义二维数组
        int[][] arr = new int[len][len];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(j == 0) {
                    arr[i][j] = 1;
                }else if(i == j) {
                    arr[i][j] = 1;
                }else if(i > j) {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("-------------");

        //输出正 杨辉三角
        for(int i = 0; i < arr.length; i++) {
            //输出空白字符         5-1-1
            for(int j = 0; j < len-i-1; j++) {
                System.out.print(' ');
            }

            for(int j = 0; j < arr[i].length; j++) {
                //只需要输出 左下方 内容
                if(i >= j)
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
