package com.briup.day13;

import java.sql.Array;
import java.util.ArrayList;

public class Test05_泛型方法 {

    //补充内容
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        String className = list.getClass().getName();
        System.out.println(className);

        ArrayList<Double> list2 = new ArrayList<>();
        String className2 = list2.getClass().getName();
        System.out.println(className2);

    }

    //泛型方法应用
    public static void main01(String[] args) {
        Demo d1 = new Demo();

        //泛型方法的调用 和 普通方法调用 一样，不需要额外指定泛型，系统会自动识别
        d1.show(1);
        d1.show(2.3);
        d1.show("hello");
        int[] arr = {1,2,3};
        d1.show(arr);

        d1.show(new ArrayList<String>());

        System.out.println("-------------");

        //调用泛型类中的static泛型方法
        //  格式：泛型类名.static方法(实参列表);
        DemoUtils.disp(1);
        DemoUtils.disp(2.3);
        DemoUtils.disp("hello");
        DemoUtils.disp(arr);
    }
}

//普通类
class Demo {
    //泛型方法
    public <T> void show(T obj) {
        //获取类名(不含全包名)
        String className = obj.getClass().getSimpleName();
        System.out.println(className + ": " + obj);
    }
}

//泛型类
class DemoUtils<E> {
    private E e;

    //泛型方法
    public static <T> void disp(T t) {
        //                            类的全包名
        System.out.println(t.getClass().getName() + " " + t);
    }
}
