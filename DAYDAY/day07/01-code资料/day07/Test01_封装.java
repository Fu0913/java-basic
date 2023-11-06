package com.briup.day07;

import com.briup.day07.bean.Account;

//测试类
public class Test01_封装 {
    public static void main(String[] args) {
        Account a1 = new Account();

        a1.setId("010");
        a1.setBalance(2000.5);
        a1.disp();

        System.out.println("---------");

        //构造方法执行时机：1.对象内存（堆）开辟成功 2.默认初始化 3.构造器初始化
        Account a2 = new Account("021",234.5);
        a2.disp();

        System.out.println("----------");
        Account a3 = new Account(2000);

        //主动调用构造方法
        //a3.Account(); error

    }
}

