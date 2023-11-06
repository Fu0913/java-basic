package com.briup.day03;

import java.util.Arrays;

/**
 * @ClassName: BubbleSort
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/12 14:28
 * @Version: v1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        /*
            4 5 3 2 1
            第一次循环：
            4 5 3 2 1
            4 3 5 2 1
            4 3 2 5 1
            4 3 2 1 5
            一共进行了4次比较
            结果：4 3 2 1 5

            第二次循环
            3 4 2 1 5
            3 2 4 1 5
            3 2 1 4 5
            一共进行了3次比较
            结果：3 2 1 4 5

            第三次循环
            2 3 1 4 5
            2 1 3 4 5
            一共进行了2次比较
            结果：2 1 3 4 5

            第四次循环
            1 2 3 4 5
            一共进行了1次比较
            结果：1 2 3 4 5

            数组的长度是5，length - 1
         */
        for (int i = 0; i < arr.length - 1; i++) {
            // i 代表循环的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换两数：临时变量
                    // int temp = arr[j];
                    // arr[j] = arr[j+1];
                    // arr[j+1] = temp;

                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
    }
}
