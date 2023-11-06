package com.briup.homework.day16;

/*
使⽤多线程编码实现：
    ⽕⻋站卖票实例，四个卖票窗⼝随机卖出50张票(static成员tickers)
注意:
    不能卖出重复的票，
    不要卖出 编号为负值的票
    每个窗⼝出票后 随机休眠时间范围在[100,200]ms。
 */
public class Test05 {
    public static void main(String[] args) {
        // 创建4个线程，模拟4个售票窗⼝
        Thread t1 = new Thread(new SaleTickets(), "窗⼝1");
        Thread t2 = new Thread(new SaleTickets(), "窗⼝2");
        Thread t3 = new Thread(new SaleTickets(), "窗⼝3");
        Thread t4 = new Thread(new SaleTickets(), "窗⼝4");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class SaleTickets implements Runnable {
    // 静态变量，表示剩余票数
    private static int tickers = 50;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while(tickers > 0) {
            synchronized (SaleTickets.class) {
                if(tickers > 0) {
                    System.out.println(name + " 卖出了第" + tickers + "张票");
                    tickers--;
                }

                //休眠一会  [100,200]
                try {
                    int n = (int)(Math.random() * (200-100+1)) + 100;
                    Thread.sleep(n);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

