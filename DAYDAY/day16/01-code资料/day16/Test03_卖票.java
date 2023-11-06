package com.briup.day16;

public class Test03_卖票 {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new TicketRunnable();
        Thread th1 = new Thread(r,"窗口1");
        Thread th2 = new Thread(r,"窗口2");
        Thread th3 = new Thread(r,"窗口3");

        th1.start();
        th2.start();
        th3.start();

        for(int i = 0; i < 50; i++) {
            Thread.sleep(10);

            System.out.println("in main, th1状态: " + th1.getState());
        }
    }
}

class TicketRunnable implements Runnable {
    //公共 的 总票数  50张
    private int num = 50;

    //公共的锁对象（唯一）
    private Object mutex = new Object();

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //同步代码块
            synchronized (mutex) {
                if(num <= 0)
                    break;

                //售票
                System.out.println(Thread.currentThread().getName() + " 销售票: " + num);

                //票数减1
                num--;
            }
        }
    }
}
