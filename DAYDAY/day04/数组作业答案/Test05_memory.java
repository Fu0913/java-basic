package com.briup.day04;

import java.util.Arrays;

/**
 * @ClassName: Test05_memory
 * @Description: 内存考核
 * @Author: songjl
 * @Date: 2023/10/13 14:07
 * @Version: v1.0
 */
public class Test05_memory {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;
        arr2[1] = 0;
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
