package com.briup.thread;

/*
    currentThread() 静态方法 获取正在执行的线程
    getName() 实例方法 获取正在执行的线程的名称
    setName() 实例方法 设置线程的名称

    Thread
    构造方法，传递名称
 */
public class Test03_name {
    public static void main(String[] args) {
        // 使用匿名内部类方式去创建线程
        // 通过构造方法传递线程名称
        Thread thread = new Thread() {
            // 重写run方法
            @Override
            public void run() {
                // 该线程要完成的具体任务
                for (int i = 1; i <= 10; i++) {
                    // currentThread() : 静态方法，拿到当前的线程
                    // Thread.currentThread()

                    // getName() : 获取线程的名字
                    String name = Thread.currentThread().getName();

                    System.out.println(name + "-" + i);
                    // sleep(millis) 让这个线程休眠millis毫秒
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        // 线程开始之前，通过Thread类中实例方法setName，为线程设置名字
        // thread.setName("子线程1");
        // 线程对象的start()方法开启线程
        thread.start();
        thread.setName("子线程1");

        for (int i = 1; i <= 10; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(name + "-" + i);
            // sleep(millis) 让这个线程休眠millis毫秒
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
