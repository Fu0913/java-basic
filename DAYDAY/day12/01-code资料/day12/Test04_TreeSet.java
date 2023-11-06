package com.briup.day12;

import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

public class Test04_TreeSet {

    //TreeSet添加自定义对象
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();

        Student s1 = new Student("zs",21);
        Student s2 = new Student("ls",21);
        Student s3 = new Student("ww",19);
        Student s4 = new Student("tom",20);
        Student s5 = new Student("zs",21);

        //将自定义对象添加到hashSet
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        //加强for循环遍历
        for (Student s : set) {
            System.out.println(s);
        }
    }

    //TreeSet：可以自动排序 元素唯一
    public static void main02(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("hello");
        set.add("nihao");
        set.add("abcd");
        set.add("world");
        set.add("nihao");

        System.out.println(set);
    }
    public static void main01(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(9);
        set.add(3);
        set.add(1);
        set.add(8);

        System.out.println(set);
    }
}
