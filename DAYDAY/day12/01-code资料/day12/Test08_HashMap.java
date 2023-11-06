package com.briup.day12;

import java.util.HashMap;
import java.util.Set;

//HashMap存储key-value时，如果key是自定义类型，则一定要重写hashCode和equals方法
public class Test08_HashMap {
    public static void main(String[] args) {
        //
        HashMap<Person,String> map = new HashMap<>();

        map.put(new Person("tom",20),"苏州");
        map.put(new Person("tom",20),"苏州");
        map.put(new Person("zs",19),"上海");
        map.put(new Person("ww",21),"太原");
        map.put(new Person("ls",22),"苏州");

        //第一种遍历
        Set<Person> set = map.keySet();
        for(Person key : set) {
            System.out.println(key + "  " + map.get(key));
        }
    }
}
