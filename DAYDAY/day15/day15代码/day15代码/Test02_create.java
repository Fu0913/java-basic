package com.briup.thread;

public class Test02_create {
    public static void main(String[] args) {
        // 创建Thread类的子类对象
        PrintNumThread printNumThread = new PrintNumThread();
        // 开启线程 start()
        // printNumThread.start();

        // 调用run方法
        printNumThread.run();

        // 开启线程start() , 而不是run()方法
        for (int i = 1; i <= 10; i++) {
            System.out.println("主线程" +i);
            // sleep(millis) 让这个线程休眠millis毫秒
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//定义 Thread 类的子类
class PrintNumThread extends Thread {
    // 重写 run() 方法

    @Override
    public void run() {
        // 该线程具体完成任务
        for (int i = 1; i <= 10; i++) {
            System.out.println("子线程" +i);
            // sleep(millis) 让这个线程休眠millis毫秒
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}