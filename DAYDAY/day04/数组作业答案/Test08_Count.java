package com.briup.day04;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName: Test08_Count
 * @Description:
 * 需求描述：
 * 1. 产生100个[1,6]之间的随机数，并统计每个数字出现的概率
 * 2. 可以创建2个数组分别保存随机数信息和统计产生次数信息
 * 3. 例如：
 * 随机数生成了10个1，20个2，30个3，5个4，10个5，25个6，
 * 对应的统计数组内容[10,20,30,5,10,25]，
 * 即统计数组的每一个位置上存放的是对应下标出现的次数
 * @Author: songjl
 * @Date: 2023/10/13 14:08
 * @Version: v1.0
 */
public class Test08_Count {
    public static void main(String[] args) {
        // 定义一个数组，存放生成的100个[1, 6]之间的随机数
        int[] arr = new int[100];
        // 定义一个数组，存放1-6出现的次数
        int[] numArr = new int[6];
        // 生成随机数
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            // 生成随机数
            // random.nextInt(100); [0, 100)
            int randomNum = random.nextInt(6) + 1;
            // 将随机数放到arr数组对应位置
            arr[i] = randomNum;
            // 表示次数的数组对应位置的值+1
            numArr[randomNum - 1]++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(numArr));
        for (int i = 0; i < numArr.length; i++) {
            System.out.println((i + 1) + "出现了" + numArr[i] + "次");
        }
    }
}
