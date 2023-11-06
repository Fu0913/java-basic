package com.briup.day10.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Test01_Integer {

    //Integer缓冲区
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        System.out.println("i1 == i2: " + (i1 == i2));

        System.out.println("---------------");

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println("i3 == i4: " + (i3 == i4));

        System.out.println("---------------");

        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println("i5 == i6: " + (i5 == i6));

        //String --> int
        int i = Integer.parseInt("127");
        System.out.println("i: " + i);
    }

    //注意事项
    public static void main02(String[] args) {
//        Long l = 20;
//        Double d = 30;
//        Integer i = 10L;

    }

    //自动装箱 拆箱 基础功能
    public static void main01(String[] args) {
        int a = 10;
        Integer i1 = a;
        Integer i2 = 20;
        Integer i3 = a + 5;

        int b = i3;
        int c = i3 - i2;

        //sout(obj);  sout(obj.toString());
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        System.out.println("-------------");

        System.out.println(b);
        System.out.println(c);

        System.out.println("-------------");

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int i = Integer.MAX_VALUE;
        //输出i的2、8、16进制形式
        String str = Integer.toString(i, 2);
        str = Integer.toString(i, 8);
        str = Integer.toString(i, 16);
        System.out.println(str);
    }
}
