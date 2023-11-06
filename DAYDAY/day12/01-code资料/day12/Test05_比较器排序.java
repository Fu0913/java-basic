package com.briup.day12;

import javax.swing.*;
import java.util.Comparator;
import java.util.TreeSet;

//比较器排序 优先级 高于 自然排序
public class Test05_比较器排序 {
    public static void main(String[] args) {
        //1.定义比较器对象【借助匿名内部类实现】
        //Comparator<Student> comp = new StuComparator();
        Comparator<Student> comp = new Comparator<Student>() {
            //先按照age降序，age相同再按照name降序
            @Override
            public int compare(Student o1, Student o2) {
                int r = o2.getAge() - o1.getAge();
                if(r == 0) {
                    r = o2.getName().compareTo(o1.getName());
                }

                return r;

                //如果要存储 相同的元素，不返回0即可
                //return (r == 0) ? 1 : r;
            }
        };

        //2.实例化对象时，传入比较器对象
        TreeSet<Student> set = new TreeSet<>(comp);
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
}

//正常写法，定义比较器类
class StuComparator implements Comparator<Student> {

    //先按照age升序，age相同再按照name升序
    @Override
    public int compare(Student o1, Student o2) {
        int r = o1.getAge() - o2.getAge();
        if(r == 0) {
            r = o1.getName().compareTo(o2.getName());
        }

        return r;
    }
}