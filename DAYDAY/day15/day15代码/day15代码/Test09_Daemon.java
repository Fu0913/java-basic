package com.briup.thread;

public class Test09_Daemon {
    public static void main(String[] args) {
        Thread thread1 = new Thread("thread1") {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                for (int i = 1; i <= 30; i++) {
                    System.out.println(name + ":" +i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                for (int i = 100; i > 50; i--) {
                    System.out.println(name + ":" +i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, "thread2");

        thread1.start();

        // setDaemon
        thread2.setDaemon(true);
        thread2.start();
    }
}


