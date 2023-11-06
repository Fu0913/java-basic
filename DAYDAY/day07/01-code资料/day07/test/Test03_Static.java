package com.briup.day07.test;

import com.briup.day07.bean.School;

public class Test03_Static {

    //static方法测试
    public static void main(String[] args) {
        //类名.static方法(实参列表); [推荐]
        School.setLibrary("逸夫楼");

        School s1 = new School("一中",3000);
        s1.disp();

        // 对象.static方法()  也可以
        s1.setLibrary("栋梁图书馆");

        System.out.println(School.library);
    }

    //static成员测试
    public static void main01(String[] args) {
        //static成员默认值: null 0 0.0 false ...
        System.out.println(School.library);

        //推荐用法：类名.static成员
        //School.library = "栋梁图书馆";

        School s1 = new School("一中",3000);
        // 可以通过 对象名.static成员，但不推荐
        System.out.println(s1.library);
        s1.disp();

        s1.library = "凌志图书馆";

        System.out.println("-----------------");

        School s2 = new School("秀峰",2500);
        System.out.println(s2.library);
        s2.disp();


    }
}
