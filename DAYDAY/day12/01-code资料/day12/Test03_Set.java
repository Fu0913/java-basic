package com.briup.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test03_Set {
    //HashSet存储 自定义对象(一定要重写hashCode和equals方法)
    //  先执行hashCode，如果值不同，则直接插入到集合中
    //  如果hashCode值相同，则执行equals方法，进行最终相同判断
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

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

        //遍历
        Iterator<Student> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }

    //基础set方法测试
    public static void main01(String[] args) {
        Set<String> set = new HashSet<>();

        //元素必须唯一，无序
        set.add("hello");
        set.add("world");
        set.add("hello");
        set.add("123");
        set.add("456");

        System.out.println(set);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(1);
        set2.add(2);
        set2.add(4);
        System.out.println(set2);
    }
}
