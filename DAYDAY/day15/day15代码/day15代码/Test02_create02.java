package com.briup.thread;

public class Test02_create02 {
    public static void main(String[] args) {
        // 使用匿名内部类方式去创建线程
        Thread thread = new Thread() {
            // 重写run方法
            @Override
            public void run() {
                // 该线程要完成的具体任务
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
        };
        // 线程对象的start()方法开启线程
        thread.start();
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