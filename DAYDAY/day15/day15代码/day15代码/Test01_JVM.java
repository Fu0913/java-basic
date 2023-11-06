package com.briup.thread;

public class Test01_JVM {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 100000; i++)
            new Test(i);
        System.gc();
        // main线程休眠3s
        Thread.sleep(3000);
        System.err.println("main end...");
    }
}

class Test {
    int n;

    public Test(int n) {
        this.n = n;
    }

    // 当GC进行垃圾回收指定对象的时候，对象的finalize方法会被自动调用
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Test被销毁, n: " + n);
    }
}