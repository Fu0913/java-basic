package com.briup.day04;

/**
 * @ClassName: Test02_traversal
 * @Description: 数组遍历
 * @Author: songjl
 * @Date: 2023/10/13 14:05
 * @Version: v1.0
 */
public class Test02_traversal {
    public static void main(String[] args) {
        String[] arr = new String[]{"hello","world","!"};
        // 第一种方式：普通for循环
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 第二种方式：增强for循环 => foreach
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
