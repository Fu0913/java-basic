package com.briup.day20;

public class Test05_ClassLoader {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader =
                ClassLoader.getSystemClassLoader();

        //扩展类加载器
        ClassLoader extClassLoader =
                systemClassLoader.getParent();

        //根类加载器
        ClassLoader bootClassLoader =
                extClassLoader.getParent();

        System.out.println(systemClassLoader);
        System.out.println(extClassLoader);
        System.out.println(bootClassLoader);
    }
}
