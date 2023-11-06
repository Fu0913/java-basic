package com.briup.day17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test04_线程池 {
    public static void main(String[] args) {
        //1.获取线程池，里面包含2个线程
        ExecutorService service =
                Executors.newFixedThreadPool(2);

        //2.创建Runnable实现类对象
        MyRunnable r = new MyRunnable();

        //3.使用线程池 运行线程处理方法
        service.submit(r);
        service.submit(r);
        service.submit(r);

        //4.关闭线程池
        service.shutdown();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("线程处理方法开始执行...");
        //模拟线程方法执行 2s
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("线程处理方法即将执行完成,放线程会线程池中！");
    }
}
