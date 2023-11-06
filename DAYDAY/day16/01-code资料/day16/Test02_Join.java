package com.briup.day16;

public class Test02_Join {
    public static void main(String[] args) throws InterruptedException {

        //1.线程1  每隔10ms 输出 1-40
        Thread th1 = new Thread() {
            @Override
            public void run() {
                for(int i = 1; i <= 40; i++) {
                    System.out.println("子线程1, i: " + i);

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        //2.线程2  每隔10ms 输出 100-70
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for(int i = 100; i >= 70; i--) {
                    System.out.println("th2, i: " + i);

                    try {
                        //关键代码，让th1插队 先执行
                        if(i == 80) {
                            th1.join(); //th1全部执行完成，th2再执行

//                            th1.join(50);   //th1优先执行50ms，然后恢复正常
                        }
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread th2 = new Thread(target);

        //2.启动子线程
        th1.start();
        th2.start();

        //3.主线程额外输出 th2的状态
        for(int i = 0; i < 70; i++) {
            System.out.println("in main,th2线程状态: " + th2.getState());
            Thread.sleep(7);
        }

    }
}
