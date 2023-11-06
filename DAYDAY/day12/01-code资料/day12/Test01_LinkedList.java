package com.briup.day12;

import java.util.LinkedList;

public class Test01_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("hello");
        list.add("world");
        list.add("123");
        list.add("hello");
        System.out.println(list);

        System.out.println("---------------");

        //使用头尾节点相关方法
        list.addFirst("456");   //456 hello world 123 hello
        list.addFirst("789");   //789 456 hello world 123 hello
        String str = list.pop();  // 取出并删除第一个元素
        System.out.println("pop: " + str); //789
        System.out.println("list: " + list);

        System.out.println("------------");

        list.removeFirst();      //456 hello world 123 hello
        list.removeLast();       //hello world 123
        System.out.println("list: " + list);
    }
}
