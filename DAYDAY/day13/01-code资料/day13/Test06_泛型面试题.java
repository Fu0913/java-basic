package com.briup.day13;

import java.util.ArrayList;
import java.util.Collection;

public class Test06_泛型面试题 {
    public static void main(String[] args) {
        Object[] arr = new Integer[2];

        //Object[] arr2 = new int[2];  error

        // ArrayList<Object> 和 ArrayList<Integer> 是2种不同的类型
        // 不是父子类，所以赋值报错
        //ArrayList<Object> list = new ArrayList<Integer>(); error

        Collection<?> coll = new ArrayList<String>();
        //coll = new ArrayList<String>();

        //coll.add("hello"); error
        coll.add(null); //ok

    }
}

class Demo02 {
    // java源代码 --> 编译得到 class文件  --> jvm运行
    public void test1(Collection<Integer> c) {}
    public void test2(Collection<String> c) {}
    public void test3(Collection<Double> c) {}
}
