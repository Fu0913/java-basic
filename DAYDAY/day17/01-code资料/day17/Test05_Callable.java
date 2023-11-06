package com.briup.day17;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test05_Callable {
    public static void main(String[] args) throws Exception {
        //3.实例化Callable的实现类类对
        MyCallable mc = new MyCallable();

        //4.创建Future的实现类FutureTask对象，把MyCallable对象作为构造方法的参数
        FutureTask<String> ft = new FutureTask<>(mc);

        //5.创建Thread对象，并传递ft对象作为构造器参数
        Thread t1 = new Thread(ft);

        //6.开启线程
        t1.start();

        //7.获取线程方法执行后返回的结果
        String s = ft.get();
        System.out.println(s);
    }
}

//1.创建Callable的实现类
class MyCallable implements Callable<String> {
    //2.重写call方法
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("跟女孩表白" + i);
            Thread.sleep(100);
        }

        //返回值就表示线程运行完毕之后的结果
        return "答应";
    }
}

