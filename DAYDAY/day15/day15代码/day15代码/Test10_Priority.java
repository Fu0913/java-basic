package com.briup.thread;

public class Test10_Priority {
    public static void main(String[] args) {
        Thread th1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000000; i++) {
                    if (i % 5000 == 0)
                        System.out.println("子线程1 i: " + i);
                }
            }
        };

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000000; i++) {
                    if (i % 5000 == 0)
                        System.out.println("th2 i: " + i);
                }
            }
        });

        //分别设置 最低 最高优先级
        // 建议性：建议抢夺时间的片的优先级，并不是绝对的
        th1.setPriority(Thread.MAX_PRIORITY); //10
        th2.setPriority(Thread.MIN_PRIORITY); // 1
        th1.start();
        th2.start();
    }
}
