package com.briup.day07.bean;

public class School {
    //名称、人数 (普通数据成员)
    private String name;
    private int num;

    //该类的所有对象 共享一块内存
    // 显式初始化
    public static String library = "栋梁图书馆";

    // static方法中 不存在 this引用
    public static void setLibrary(String library) {
        //静态只能访问静态
        //this.name = "二中";
        //this.disp();
        //this.library = library; error

        School.library = library;
    }

    //构造方法
    public School() {}
    public School(String name) {
        this(name,0);
    }
    public School(String name, int num) {
        this.name = name;
        this.num = num;
    }

    //public get|set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public void disp() {
        //                          this.name     this.num      School.library
        System.out.println("School: " + name + ", " + num + ", " + library);
    }
}
