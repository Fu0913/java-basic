package com.briup.day21;

import java.lang.String;

/*
    自定义java.lang.String,然后在代码中使用
    观察：类加载器到底加载 JDK提供的，还是自定义的?
 */
public class Test01_类加载器 {

    public static void main(String[] args) {

        char[] buff = {'h','e','l','l','o'};
        String msg = new String(buff);

        System.out.println(msg);
    }
}
