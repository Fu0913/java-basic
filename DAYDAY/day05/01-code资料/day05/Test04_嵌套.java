package com.briup.day05;

public class Test04_嵌套 {
    //倒金字塔形状
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++) {
            //输出 ' '
            for(int j = 1; j < i; j++) {
                System.out.print(' ');
            }


            //输出 '*'
            for(int j = 1; j <= (6-i)*2+1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    //正金字塔形状
    public static void main02(String[] args) {
        for(int i = 1; i <= 5; i++) {
            //输出空白字符 ' '
            for(int j = 1; j <= 5-i; j++) {
                System.out.print(' ');
            }

            //输出 '*'
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    //循环嵌套一般写法：
    //1.确定外层循环次数
    //2.确定内存循环次数 和 行数关系
    public static void main01(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
