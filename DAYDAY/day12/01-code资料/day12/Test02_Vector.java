package com.briup.day12;

import java.util.Enumeration;
import java.util.Vector;

public class Test02_Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        //添加元素
        vector.addElement("hello");
        vector.addElement("world");
        vector.addElement("123");
        vector.addElement("world");

        //遍历元素
        Enumeration<String> elements = vector.elements();
        while(elements.hasMoreElements()) {
            String str = elements.nextElement();
            System.out.println(str);
        }
    }
}
