package com.briup.day17;

//1-26   A-Z  2个线程 交替运行
public class Test01_2个线程通信 {
    //线程执行标记  0表示线程1执行    1表示线程2执行
    static int flag = 0;

    //使用static成员flag标志
    public static void main01(String[] args) {
        //准备公共的锁对象
        final Object mutex = new Object();

        //局部变量
        //final int flag = 0;

        Thread th1 = new Thread() {
            @Override
            public void run() {
                for(int i = 1; i <= 26; i++) {
                    synchronized (mutex) {
                        if(flag == 1) {
                            try {
                                mutex.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.print(i + " ");

                        //修改标记
                        flag = 1;
                        //通知另一个线程执行
                        mutex.notify();
                    }
                }
            }
        };

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(char c = 'A'; c <= 'Z'; c++) {
                    synchronized (mutex) {
                        if(flag == 0) {
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
                        mutex.notify();
                    }
                }
            }
        });

        //启动线程
        th1.start();
        th2.start();
    }

    //使用 类普通成员flag 标志
    public static void main(String[] args) {
        //准备公共的锁对象
        final Object mutex = new Object();

        Demo d = new Demo();

        Thread th1 = new Thread() {
            @Override
            public void run() {
                for(int i = 1; i <= 26; i++) {
                    synchronized (mutex) {
                        if(d.flag == 1) {
                            try {
                                mutex.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.print(i + " ");

                        //修改标记
                        d.flag = 1;
                        //通知另一个线程执行
                        mutex.notify();
                    }
                }
            }
        };

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(char c = 'A'; c <= 'Z'; c++) {
                    synchronized (mutex) {
                        if(d.flag == 0) {
                            try {
                                mutex.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.print(c + " ");

                        //修改标记
                        d.flag = 0;
                        //通知另一个线程执行
                        mutex.notify();
                    }
                }
            }
        });

        //启动线程
        th1.start();
        th2.start();
    }
}

//标志类
class Demo {
    int flag = 0;
}