package com.briup.day05;

import java.util.Arrays;

public class Test03_Arrays {

    //反转
    public static void reverseArray(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len/2; i++) {
            //交换 arr[i] 和 arr[len-1-i]的值
            arr[i] = arr[i] ^ arr[len-1-i];
            arr[len-1-i] = arr[i] ^ arr[len-1-i];
            arr[i] = arr[i] ^ arr[len-1-i];
        }
    }

    //反转测试
    public static void main(String[] args) {
        //1.准备数组
        int[] array = {8,6,9,1,11,4,12,7};

        //简单遍历写法：借助Arrays工具类实现
        System.out.println(Arrays.toString(array));

        //2.反转
        reverseArray(array);

        //3.遍历
        System.out.println(Arrays.toString(array));
    }

    //获取最大值
    public static int getMax(int[] arr) {
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    //测试：求数组最大值
    public static void main02(String[] args) {
        int[] array = {3,2,11,4,5,7};
        int m = getMax(array);
        System.out.println("max: " + m);
    }

    //Arrays基本使用
    public static void main01(String[] args) {
        int[] arr = {3,2,1,4,5,7};

        //获取数组的字符串形式
        String str = Arrays.toString(arr);
        System.out.println(str);
        System.out.println("arr: " + arr);

        //数组拷贝
        int[] array = Arrays.copyOf(arr,9);
        System.out.println(Arrays.toString(array));
        System.out.println("array: " + array);

        //排序  1,2,3,4,5,7
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //二分查找    5
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("5对应索引：" + index);
    }
}
