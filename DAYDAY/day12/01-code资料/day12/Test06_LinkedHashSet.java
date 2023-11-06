package com.briup.day12;

import java.util.LinkedHashSet;
import java.util.Set;

//相对HashSet，可以保证存取次序
public class Test06_LinkedHashSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("hello");
        set.add("world");
        set.add("hello");
        set.add("123");
        set.add("456");

        System.out.println(set);
    }
}
