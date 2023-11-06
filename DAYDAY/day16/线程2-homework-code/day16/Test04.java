package com.briup.homework.day16;

/*
1. 定义子线程1，线程处理函数中输出 1-50，每隔5ms输出一次
2. 定义子线程2，线程处理函数中输出 A-Z，每隔10ms输出一次
3. 要求，当线程1输出30之后，线程2插队进来优先输出，全部输出后，线程1再输出31-50
 */
public class Test04 {
    public static void main(String[] args) {
        //1.创建线程  注意：先创建th2
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(char c = 'A'; c <= 'Z'; c++) {
                    System.out.println("in th2, c: " + c);

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread th1 = new Thread() {
            @Override
            public void run() {
                for(int i = 1; i <= 50; i++) {
                    System.out.println("in th1, i: " + i);

                    try {
                        Thread.sleep(5);

                        //th2插队进来优先执行
                        if(i == 30) {
                            th2.join();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        //2.启动线程
        th1.start();
        th2.start();
    }
}
