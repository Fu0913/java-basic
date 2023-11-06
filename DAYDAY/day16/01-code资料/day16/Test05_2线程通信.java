package com.briup.day16;

public class Test05_2线程通信 {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();

        Thread th1 = new Producer(bz);
        Thread th2 = new Customer(bz);

        th1.start();
        th2.start();
    }
}

class BaoZi {
    //包子数量
    int num = 0;

    //包子状态: 没有包子
    boolean isExists = false;
}

//生产者类
class Producer extends Thread {
    private BaoZi bz;

    public Producer() {}
    public Producer(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        //生产100次包子
        for(int i = 0; i < 100; i++) {
            //使用包子作为锁对象
            synchronized (bz) {
                try {
                    if (bz.isExists)
                        bz.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //生产包子
                bz.num++;
                System.out.println("生产包子，数量: " + bz.num);

                //修改包子状态
                bz.isExists = true;

                //通知另一个线程 吃包子
                bz.notify();
            }
        }
    }
}

//消费者类
class Customer extends Thread {
    private BaoZi bz;

    public Customer() {}
    public Customer(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        //使用包子作为锁对象
        synchronized (bz) {
            //吃100次包子
            for(int i = 0; i < 100; i++) {
                //使用包子作为锁对象
                synchronized (bz) {
                    try {
                        if (bz.isExists == false)
                            bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //吃包子
                    bz.num--;
                    System.out.println("吃包子，吃完后包子数量：" + bz.num);

                    //修改包子状态
                    bz.isExists = false;

                    //通知生产线程，去蒸包子
                    bz.notify();
                }
            }
        }
    }
}



