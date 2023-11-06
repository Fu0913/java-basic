package com.briup.day03;

/**
 * @ClassName: BinarySearch
 * @Description: 二分查找
 * @Author: songjl
 * @Date: 2023/10/12 14:05
 * @Version: v1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 9, 10};
        int index = binarySearch(arr, 1);
        System.out.println("1: " + index);
        index = binarySearch(arr, 2);
        System.out.println("2: " + index);
        index = binarySearch(arr, 10);
        System.out.println("10: " + index);
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0; // 左边界
        int high = arr.length - 1;// 右边界
        int mid = 0;// 中间元素对应的索引
        while (low <= high) {
            mid = (low + high) >>> 1;

            if (target < arr[mid]) {
                high = mid - 1;
            }else if (target > arr[mid]) {
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static int findTarget(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
