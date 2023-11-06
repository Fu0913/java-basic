package com.briup.day04;

public class Test05_DoWhile {
    //循环不断的生成[10,20]随机数，直到生成随机数为15的时候，结束循环，输
    //出循环的次数。
    public static void main(String[] args) {
        int count = 0;
        //value存储每次随机生成的数
        int value;
        do {
            value = (int)(Math.random() * (20 - 10 + 1) + 10);
            System.out.println("value: " + value);
            count++;
        }while(value != 15);

        System.out.println("随机次数count: " + count);
    }
}
