package com.briup.day04;

/**
 * @ClassName: Test03_secondValue
 * @Description: 寻找次大值
 * @Author: songjl
 * @Date: 2023/10/13 14:05
 * @Version: v1.0
 */
public class Test03_secondValue {
    public static void main(String[] args) {
        int[] arr = {12, 4, 56, 45, 67, 34, 52, 28, 65};
        int num = getSecondValue(arr);
        System.out.println("次大值: " + num);
    }

    public static int getSecondValue(int[] arr) {
        // 默认使用第一个值作为最大值
        int max = (arr[0] > arr[1]) ? arr[0] : arr[1];
        // 默认使用第二个值作为第二大值
        int sec = (arr[0] > arr[1]) ? arr[1] : arr[0];
        // 补全代码
        /*
            12, 4, 56, 45, 67, 34, 52, 28, 65
            max = 12  sec = 4
            56 > max   56 max    max sec
            56 > sec   56 sec
            56 < sec
         */
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                // 比最大值大
                sec = max;
                max = arr[i];
            }else if (arr[i] > sec) {
                sec = arr[i];
            }
        }
        return sec;
    }
}
