package com.briup.day05;

public class Test02_Array {
    //封装遍历int[]方法
    public static void outArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    //数组静态初始化【使用最多】
    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[]{1,2,3,4};

        //第二种形式，简化【推荐】
        int[] arr2 = {4,3,2,1,5};

        //可以直接只用数组名进行赋值
        //注意1：必须都为数组类型
        //注意2：数组中元素类型一致
        arr2 = arr1;

        outArray(arr2);

        arr1 = null;
        //System.out.println("arr1[1]: " + arr1[1]);
    }

    //数组下标
    public static void main02(String[] args) {
        int[] arr = new int[4];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        System.out.println("-----------");

        for(int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("-----------");
        double[] arr2 = new double[3];
        boolean[] arr3 = new boolean[2];
        String[] arr4 = new String[2];
        System.out.println("double: " + arr2[0]);
        System.out.println("boolean: " + arr3[0]);
        System.out.println("String: " + arr4[0]);
    }

    //数组 内存构成
    public static void main01(String[] args) {
        int[] arr1 = new int[4];
        // [I@4554617c
        System.out.println(arr1);

        //int[] arr2;
        //System.out.println(arr2);

        double[] arr3 = new double[2];
        // [D@74a14482
        System.out.println(arr3);

        int[][] arr4 = new int[2][3];
        // [[I@1540e19d
        System.out.println(arr4);
    }
}
