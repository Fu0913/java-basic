package com.briup.day05;

public class Test05_Label {
    public static void main(String[] args) {
        label1: for(int i = 0; i < 3; i++) {//外层循环
            label2: for(int j = 0; j < 5; j++) {//内层循环
                if(j == 2) {
                    //此时可直接跳出外层循环，然后往下执行
                    break label1;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println("----------------------");
        }

        System.out.println("out of 外层循环!");
    }
}
