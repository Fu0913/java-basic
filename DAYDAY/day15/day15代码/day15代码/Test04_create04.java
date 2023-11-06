package com.briup.thread;

public class Test04_create04 {
    public static void main(String[] args) {
        // Thread有一个构造器，可以传递runnable接口的实现类来创建线程对象
        // Thread还有一个构造器，可以传递runnable接口以及线程名称
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // 具体的线程要完成的任务
                for (int i = 1; i <= 100; i++) {
                    String name = Thread.currentThread().getName();
                    if (i % 2 != 0) {
                        System.out.println(name + ":" + i);
                    }
                    try {
                        Thread.sleep(100);// run方法中出现的异常必须try-catch处理
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, "打印奇数线程");


        // 通过setName给线程去设置名字
        // thread.setName("打印奇数线程");
        thread.start();

        // 主线程打印偶数
        for (int i = 1; i <= 100; i++) {
            String name = Thread.currentThread().getName();
            if (i % 2 == 0) {
                System.out.println(name + ":" + i);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}