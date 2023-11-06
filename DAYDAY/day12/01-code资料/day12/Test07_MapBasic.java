package com.briup.day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test07_MapBasic {
    public static void main(String[] args) {
        //1.实例化map对象
        Map<Integer,String> map = new HashMap<>();

        //2.添加元素(key必须唯一，value可以不唯一)
        map.put(1,"zs");
        map.put(10,"ls");
        map.put(5,"zs");
        map.put(3,"zl");
        map.put(1,"tom");

        System.out.println(map);

        System.out.println("size: "+map.size());
        boolean f = map.containsKey(1);
        System.out.println("containsKey(1): " + f); //true

        f = map.containsValue("zs");    //true
        System.out.println("value(zs): " + f);

        //          value = get(key)
        System.out.println("key: 1, value: " + map.get(1)); //tom

        System.out.println("------------------");

        //遍历集合,思路1：
        //先获取所有的key，然后遍历，根据key再获取对应的value
        // keySet() 获取所有key
        Set<Integer> set = map.keySet();
        for(Integer key : set) {
            String value = map.get(key);
            System.out.println("key: " + key + " value: " + value);
        }

        System.out.println("----------------");

        //遍历map,思路2【固定写法，记住即可】
        //  1.获取所有的key-value对
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        //  2.拆分key value进行输出
        Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
