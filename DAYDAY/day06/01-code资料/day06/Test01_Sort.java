package com.briup.day06;

import java.util.Arrays;

public class Test01_Sort {

    //数组拷贝
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};

        int[] array = new int[5];

        //将arr所有元素拷贝 array中
        //System.arraycopy(arr,0,array,0,arr.length);
        System.arraycopy(arr,2,array,0,2);

        System.out.println(Arrays.toString(array));
    }

    //选择排序
    public static void selectSort(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len-1; i++) {
            //i
            int minIndex = i;
            for(int j = i+1; j < len; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            //遍历完成后，交换i minIndex位置值
            if(minIndex != i) {
                arr[minIndex] = arr[minIndex] ^ arr[i];
                arr[i] = arr[minIndex] ^ arr[i];
                arr[minIndex] = arr[minIndex] ^ arr[i];
            }

            System.out.println("第" + (i+1) + "次排序: " + Arrays.toString(arr));
        }
    }

    //排序测试
    public static void main01(String[] args) {
        int[] array = {20,40,30,10,60,50};

        selectSort(array);

        System.out.println(Arrays.toString(array));
    }
}
