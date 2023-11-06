package com.briup.day05;

public class Test01_Swap {
    //    函数调用：	swap(a,b);
    //				int x = a; int y = b;
    public static void swap(int x, int y) {
        System.out.println("交换前，x: " + x + " y: " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("交换后，x: " + x + " y: " + y);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //调用方法
        swap(a,b);

        System.out.println("交换后，a: " + a + " b: " + b);
    }
}
