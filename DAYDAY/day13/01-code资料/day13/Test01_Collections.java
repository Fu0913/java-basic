package com.briup.day13;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test01_Collections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);
        list.add(5);

        System.out.println(list);

        Integer max = Collections.max(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        Integer min = Collections.min(list);
        System.out.println(max + " " + min);
        System.out.println("--------------");

        //反转
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("--------------");

        //排序
        Collections.sort(list);
        System.out.println(list);

        System.out.println("--------------");

        //随机打乱
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("-------------");

        Collections.addAll(list,10,8,11);
        System.out.println(list);

        System.out.println("-------------");

        //指定数据替换集合中所有元素值
        Collections.fill(list,10);
        System.out.println(list);

    }
}
