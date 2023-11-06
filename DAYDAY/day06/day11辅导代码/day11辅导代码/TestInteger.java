package com.briup.day11;

/**
 * @ClassName: Test03
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/20 08:06
 * @Version: v1.0
 */
public class TestInteger {
    public static void main(String[] args) {
        Integer i1 = new Integer(97);
        Integer i2 = new Integer(97);
        System.out.println(i1 == i2);// false
        System.out.println(i1.equals(i2));// true


        Integer i3 = new Integer(148);
        Integer i4 = new Integer(148);
        System.out.println(i3 == i4);// false
        System.out.println(i3.equals(i4));// true


        /*
            缓冲区（-128 ～ 127）
            只有在自动装箱操作的时候
         */
        Integer i5 = 97;
        Integer i6 = 97;
        System.out.println(i5 == i6);// true
        System.out.println(i5.equals(i6));// true

        Integer i7 = 148; // new Integer(148)
        Integer i8 = 148;
        System.out.println(i7 == i8);// false
        System.out.println(i7.equals(i8));// true

        // 基本数据类型和包装类型进行比较的时候
        // 包装类型自动拆箱
        int a = 148;
        int b = 97;
        Integer c = 97;
        System.out.println(i7 == a);// true
        System.out.println(b == c);// true
    }
    /*
        == 操作符
            基本数据类型  值是否相等
            引用数据类型  地址值是否相等
        equals 方法（Object）
            ==
            重写equals，比较规则看具体的重写后equals中的逻辑
     */
}
