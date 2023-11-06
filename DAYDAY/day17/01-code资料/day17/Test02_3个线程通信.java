package com.briup.day17;

// a-z   1-26   A-Z  3个线程 交替运行
public class Test02_3个线程通信 {
    //线程执行标记  0表示线程1执行    1表示线程2执行   2表示线程3执行
    static int flag = 0;

    //使用static成员flag标志
    public static void main(String[] args) {
        //准备公共的锁对象
        final Object mutex = new Object();

        Thread th1 = new Thread() {
            @Override
            public void run() {
                for(char c = 'a'; c <= 'z'; c++) {
                    synchronized (mutex) {
                        while(flag != 0) {
                            try {
                                mutex.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.print(c + " ");

                        //修改标记
                        flag = 1;
                        //通知另一个线程执行
                        mutex.notifyAll();
                    }
                }
            }
        };

        Thread th2 = new Thread() {
            @Override
            public void run() {
                for(int i = 1; i <= 26; i++) {
                    synchronized (mutex) {
                        while(flag != 1) {
                            try {
                                mutex.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.print(i + " ");

                        //修改标记
                        flag = 2;
                        //通知另一个线程执行
                        mutex.notifyAll();
                    }
                }
            }
        };

        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(char c = 'A'; c <= 'Z'; c++) {
                    synchronized (mutex) {
                        while(flag != 2) {
                            try {
                                mutex.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.print(c + " ");

                        //修改标记
                        flag = 0;
                        //通知另一个线程执行
                        mutex.notifyAll();
                    }
                }
            }
        });

        //启动线程
        th1.start();
        th2.start();
        th3.start();
    }
}
