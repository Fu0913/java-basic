package com.briup.day11;

/**
 * @ClassName: TestFor
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/20 08:20
 * @Version: v1.0
 */
public class TestFor {
    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for (foo('a'); foo('b') && (i < 2); foo('c')) {
            i++;
            foo('d');
        }
    }
    // for(第一个表达式；第二个表达式；第三个表达式) {}

    // foo('a') a
    // foo('b') && (i < 2) b
    // foo('d'); d
    // foo('c') c
    // foo('b') && (i < 2) b
    // foo('d'); d
    // foo('c') c
    // foo('b') && (i < 2) b

    // abdcbdcb
}