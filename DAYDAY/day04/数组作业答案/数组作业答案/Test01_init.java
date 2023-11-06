package com.briup.day04;

/**
 * @ClassName: Test01_init
 * @Description: 数组初始化
 * @Author: songjl
 * @Date: 2023/10/13 14:04
 * @Version: v1.0
 */
public class Test01_init {
    public static void main(String[] args) {
        // 第一种方式
        String[] arr1 = new String[] {"a", "b", "c"};
        // 第二种方式
        String[] arr2 = {"a", "b", "c"};
        // 第三种方式
        String[] arr3 = new String[3];
        arr3 = new String[]{"a", "b", "c"};
    }
}
