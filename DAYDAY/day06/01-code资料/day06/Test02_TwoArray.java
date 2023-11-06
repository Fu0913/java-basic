package com.briup.day06;

public class Test02_TwoArray {

    //二维数组的遍历
    public static void outTwoArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //初始化
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,2,3},
                {4,5}
        };

        System.out.println(arr.length); //?  2
        System.out.println(arr[0].length);  //第一个元素(一维数组)的长度 3
        System.out.println(arr[1].length);  //第二个元素(一维数组)的长度 2

        outTwoArray(arr);

        System.out.println("-------------");

        //二维数组元素求和
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("二维数组累加和：" + sum);
    }

    //基础定义及内存理解
    public static void main01(String[] args) {
        //第一种定义方式
        int[][] arr1 = new int[2][3];
        // [[I@4554617c
        System.out.println("arr1: " + arr1);

        //          一维数组名：引用值
        //二维数组第一个元素: [I@74a14482
        System.out.println("二维数组第一个元素: " + arr1[0]);
        //二维数组第二个元素: [I@1540e19d
        System.out.println("二维数组第二个元素: " + arr1[1]);

        System.out.println("------------");

        //第二种定义方式       第二维长度 不指定
        int[][] arr2 = new int[2][];
        System.out.println(arr2);
        System.out.println(arr2[0]);    //null
        System.out.println(arr2[1]);    //null

        arr2[0] = new int[]{1,2,3};
        arr2[1] = new int[]{4,5};

        System.out.println("arr2[0][1]: " + arr2[0][1]); //2
        System.out.println("arr2[1][2]: " + arr2[1][2]); //? 异常
    }
}
