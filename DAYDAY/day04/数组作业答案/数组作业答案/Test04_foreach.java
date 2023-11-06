package com.briup.day04;

/**
 * @ClassName: Test04_foreach
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/13 14:07
 * @Version: v1.0
 */
public class Test04_foreach {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        for (int num : arr1){
            num = 4;
        }
        System.out.println("输出：" + arr1[0]);
    }
}
