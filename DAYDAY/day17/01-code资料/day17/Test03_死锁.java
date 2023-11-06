package com.briup.day17;

//避免死锁情况：如果有多把锁，所有线程上锁次序必须一致：先锁1 再锁2
public class Test03_死锁 {
    public static void main(String[] args) throws InterruptedException {

        //准备2把锁
        Object m1 = new Object();
        Object m2 = new Object();

        Thread th1 = new Thread("线程1") {
            @Override
            public void run() {
                String name = this.getName();
                for(int i = 0; i < 100; i++) {
                    synchronized (m1) {
                        System.out.println(name + "获取到 第1把锁，期待第2把锁！");

                        synchronized (m2) {
                            System.out.println(name + "获取到 第2把锁，代码执行成功！");
                        }
                    }

                }
            }
        };

        Thread th2 = new Thread("th2") {
            @Override
            public void run() {
                String name = this.getName();
                for(int i = 0; i < 100; i++) {
                    synchronized (m2) {
                        System.out.println(name + "获取到 第2把锁，期待第1把锁！");

                        synchronized (m1) {
                            System.out.println(name + "获取到 第1把锁，代码执行成功！");
                        }
                    }
                }
            }
        };

        th1.start();
        Thread.sleep(2);
        th2.start();

    }
}
