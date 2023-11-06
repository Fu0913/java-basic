package com.briup.day12;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test10_TreeMap {

    //TreeMap中的key，如果是自定义类，则需要指定排序规则【1.自然排序 2.比较器排序】
    public static void main(String[] args) {
        //先按年龄降序，再按照姓名升序
        Comparator<Person> comp = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int r = o2.getAge() - o1.getAge();
                if(r == 0) {
                    r = o1.getName().compareTo(o2.getName());
                }

                return r;
            }
        };

        Map<Person,String> map = new TreeMap<>(comp);

        map.put(new Person("tom",20),"昆山");
        map.put(new Person("tom",20),"太原");
        map.put(new Person("jack",21),"昆山");
        map.put(new Person("jack",19),"吕梁");
        map.put(new Person("lucy",19),"shanghai");
        map.put(new Person("rose",19),"suzhou");

        for(Person key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

    }
}
