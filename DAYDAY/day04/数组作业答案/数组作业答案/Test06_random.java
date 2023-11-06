package com.briup.day04;

import java.util.Arrays;

/**
 * @ClassName: Test06_random
 * @Description: 产生10个随机数，范围在[1，100]，使用java.lang.Math类实现
 * @Author: songjl
 * @Date: 2023/10/13 14:08
 * @Version: v1.0
 */
public class Test06_random {
    public static void main(String[] args) {
        //定义数组存放随机数
        int[] randomArr = new int[10];
        // Math.random()  [0,1)
        // double random = Math.random();
        // System.out.println(random);
        // Math.random() * 100 [0, 100) + 1
        // (int) (Math.random() * 100 + 1)
        for (int i = 0; i < randomArr.length; i++) {
            int randomNum = (int) (Math.random() * 100 + 1);
            randomArr[i] = randomNum;
        }
        System.out.println(Arrays.toString(randomArr));
    }
}
