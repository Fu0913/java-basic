package com.briup.day12;

import java.util.HashMap;
import java.util.Hashtable;

//HashMap和Hashtable能否存储null值
public class Test09_Hashtable {
    public static void main(String[] args) {
        //HashMap的key和value可以为null
        HashMap<String,Integer> map = new HashMap<>();
        map.put(null,1);
        map.put("tom",null);
        System.out.println(map);

        //Hashtable的key和value都不可以为null
        Hashtable<Integer,String> table = new Hashtable<>();
        //table.put(null,"lucy");
        //table.put(3,null);
        System.out.println(table);
    }
}
