package com.briup.thread;

public class Test04_create03 {
    public static void main(String[] args) {
        // 创建Runnable的实现类对象
        PrintOddNumThread printOddNumThread = new PrintOddNumThread();
        // 创建线程对象
        Thread thread = new Thread(printOddNumThread);
        thread.start();

        // 主线程打印偶数
        for (int i = 1; i <= 100; i++) {
            String name = Thread.currentThread().getName();
            if (i % 2 == 0) {
                System.out.println(name + ":" + i);
            }
        }
    }
}

// 实现runnable接口，重写run方法
class PrintOddNumThread implements Runnable {

    @Override
    public void run() {
        // 该线程要完成的具体的任务
        for (int i = 1; i <= 100; i++) {
            String name = Thread.currentThread().getName();
            if (i % 2 != 0) {
                System.out.println(name + ":" + i);
            }
        }
    }
}