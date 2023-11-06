package com.briup.day10.homework;

/**
 * @ClassName: Test4_3_Interface
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/19 10:35
 * @Version: v1.0
 */
public class Test4_3_Interface {
    public static void main(String[] args) {
        Person p = new Student("jack", 20, "002", 89.6);
        p.run();

        if (p instanceof Student) {
            Student s = (Student) p;
            s.fly();
            s.sing();
        }

        ISingAble is = new Student("lucy", 21, "012", 80.6);
        is.sing();
        if (is instanceof Student) {
            Student s = (Student) is;
            s.fly();
            s.run();
        }

        if (is instanceof Student) {
            IFlyAble ifly = (IFlyAble) is;
            ifly.fly();
        }
    }
}
