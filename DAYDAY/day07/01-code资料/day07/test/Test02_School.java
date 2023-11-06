package com.briup.day07.test;

import com.briup.day07.bean.School;

public class Test02_School {
    //基础测试
    public static void main(String[] args) {
        School s1 = new School("第一中学",3000);
        s1.disp();

        School s2 = new School();
        s2.setName("秀峰中学");
        s2.setNum(2500);
        s2.disp();

        School s3 = new School("娄江中学");
        s3.setNum(1800);
        s3.disp();
    }
}
