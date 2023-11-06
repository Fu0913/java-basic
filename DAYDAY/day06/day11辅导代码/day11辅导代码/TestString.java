package com.briup.day11;

/**
 * @ClassName: TestString
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/20 08:13
 * @Version: v1.0
 */
public class TestString {
    /*
        (JDK8) 字符串常量池 -> 堆
        字面量常量 存放 字符串常量池
     */
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        // String str = "hello"+"hello";
        String str3 = new String("hello");
        String str4 = new String("hello");
        String str5 = "hellohello";
        String str6 = str1 + str2;// StringBiuld append new String("")
        System.out.println(str1 == str2);// 都指向字符串常量池中的“hello”，true
        System.out.println(str2 == str3);// str2 字符串常量池 str3 堆 false
        System.out.println(str3 == str4);// 比较的是堆中的地址，false
        System.out.println(str2.equals(str3));// true
        System.out.println(str3.equals(str4));// true
        System.out.println(str5.equals(str6));// true
        System.out.println(str5 == str6);// false
    }

    /*

        String str = new String("hello");
        这句话创建了几个对象？
        字符串常量池 hello
        堆
        2个

        1个 hello在字符串常量池中已经存在了
     */
}
