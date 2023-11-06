package com.briup.day10.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test03_String {

    //   . 特殊含义的字符   split(".") 无法生效
    //  对于特殊含义的字符， 使用 split("[.]") 或 split("\\.")可以实现分割
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input a string(学号.姓名.年龄): ");
        String str = sc.nextLine();
        System.out.println("str: " + str);

        //String[] arr = str.split("\\.");
        String[] arr = str.split("[.]");

        //解析得到对应的学号 姓名 年龄，然后输出
        String id = arr[0];
        String name = arr[1];
        // String -> int
        int age = Integer.parseInt(arr[2]);

        System.out.println(id + " " + name + " " + age);


        /*
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
         */
    }

    //split('字符')  按照字符进行分割
    //  "001:zs:78"    按照 : 分割  String[] {"001","zs","78"}
    //   : 普通字符，没有特殊含义
    public static void main03(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input a string: ");
        String str = sc.nextLine();

        //按照：进行分割
        String[] arr = str.split(":");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        for (String s : arr) {
//            System.out.println(s);
//        }
    }

    //toCharArray()
    public static void main02(String[] args) {
        String s = "hello world";
        char[] arr = s.toCharArray();

        //增强for循环   fore
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();

        System.out.println("------------");


        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    //基础案例
    public static void main01(String[] args) {
        String s = "hello";

        System.out.println(s.length());     //5
        System.out.println(s.charAt(2));    //l

        Scanner sc = new Scanner(System.in);
        System.out.print("input a string: ");
        //获取一行字符串
        String str = sc.nextLine();

        boolean f = s.equals(str);
        System.out.println(f);

    }
}
