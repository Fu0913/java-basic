package com.briup.day16;

public class Test01_龟兔赛跑 {

    //进一步优化，使用static成员 表示游戏结束状态
    public static void main(String[] args) {
        Runnable r = new MyRunnable();

        //1.创建乌龟线程
        Thread th1 = new Thread(r,"乌龟");
        Thread th2 = new Thread(r,"兔子");

        //线程启动
        th1.start();
        th2.start();
    }

    //优化为一个run方法，两个线程共用
    public static void main02(String[] args) {

        //游戏结束标记
        GameState state = new GameState();

        //提供 线程处理方法
        Runnable r = new Runnable() {

            @Override
            public void run() {
                String name = Thread.currentThread().getName();

                //生成随机数，然后进行累加
                int sum = 0;
                while(sum < 100) {
                    if(state.isOver)
                        break;

                    double r = Math.random();

                    if(r >= 0 && r < 0.3 && "兔子".equals(name)) {
                        sum += 2;
                        System.out.println(name + " 跑的距离: " + sum);
                    }

                    if(r >= 0.3 && r < 1.0 && "乌龟".equals(name)) {
                        sum += 1;
                        System.out.println(name + " 跑的距离: " + sum);
                    }

                    if(sum >= 100)
                        state.isOver = true;
                }

                if(sum >= 100)
                    System.out.println(name + " 赢得比赛");
            }
        };

        //1.创建乌龟线程
        Thread th1 = new Thread(r,"乌龟");
        Thread th2 = new Thread(r,"兔子");

        //线程启动
        th1.start();
        th2.start();
    }

    //基础功能实现：1.乌龟、兔子线程  各自分开
    public static void main01(String[] args) {

        //游戏结束标记
        GameState state = new GameState();
        // state.isOver == false;

        //1.创建乌龟线程
        Thread th1 = new Thread() {
            @Override
            public void run() {
                //乌龟跑出的距离
                int sum = 0;

                while(sum < 100) {
                    if(state.isOver == true)
                        break;

                    //生成随机数，判断其值是否[0.3,1) 累加sum
                    double r = Math.random();
                    if(r >= 0.3 && r < 1) {
                        sum += 1;

                        if(sum >= 100)
                            state.isOver = true;

                        System.out.println("乌龟跑了 " + sum + "米");
                    }
                }

                if(sum >= 100)
                    System.out.println("乌龟是冠军，跑完了100米");
            }
        };

        //兔子线程
        Thread th2 = new Thread() {
            @Override
            public void run() {
                //兔子跑出的距离
                int sum = 0;

                while(sum < 100) {
                    if(state.isOver == true)
                        break;

                    //生成随机数，判断其值是否[0,0.3) 累加sum
                    double r = Math.random();
                    if(r >= 0 && r < 0.3) {
                        sum += 2;

                        if(sum >= 100)
                            state.isOver = true;

                        System.out.println("兔子跑了 " + sum + "米");
                    }
                }

                if(sum >= 100)
                    System.out.println("兔子赢得冠军，跑完了100米");
            }
        };

        //线程启动
        th1.start();
        th2.start();
    }
}

class GameState {
    boolean isOver = false;
}

//第三种方案：提供static成员 isOver
class MyRunnable implements Runnable {
    //游戏状态：尚未结束
    static boolean isOver = false;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        //生成随机数，然后进行累加
        int sum = 0;
        while(sum < 100) {
            if(isOver)
                break;

            double r = Math.random();

            if(r >= 0 && r < 0.3 && "兔子".equals(name)) {
                sum += 2;
                System.out.println(name + " 跑的距离: " + sum);
            }

            if(r >= 0.3 && r < 1.0 && "乌龟".equals(name)) {
                sum += 1;
                System.out.println(name + " 跑的距离: " + sum);
            }

            if(sum >= 100)
                isOver = true;
        }

        if(sum >= 100)
            System.out.println(name + " 赢得比赛");
    }
}