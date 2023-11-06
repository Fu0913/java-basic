package com.briup.day04;

public class Test03_For {

    //输出所有的水仙花数【100-999】
    public static void main(String[] args) {

        //确定循环次数，范围
        //for(int i = 100; i < 1000; i++) {

        //初始化语句1，可以放到循环前面
        int i = 100;
        //提前准备好的计数器：用来统计水仙花数个数
        int count = 0;
        for(; i < 1000; i++) {
            //int count = 0;

            //判断i是否为水仙花数   123
            int g = i % 10;
            int s = i / 10 % 10;
            int b = i / 100;

            if(i == g*g*g + s*s*s + b*b*b) {
                count++;
                System.out.println(i + " 是水仙花数");
            }
            //执行循环后语句4，也可以放在循环体后面
            //i++;
        }

        //System.out.println("i: " + i);

        //输出统计结果
        System.out.println("水仙花数个数：" + count);

        System.out.println("after for ...");
    }
}
