package com.briup.day09.test;

public class Test04_多态扩展 {
    public static void main(String[] args) {
        Ball ball = new BasketBall2();

        Game2 g = new Game2();
        g.start(ball);

        ball = new Football2();
        g.start(ball);

        ball = new PingPong2();
        //扩展功能实现
        g.start(ball);
    }
}

class Game2 {
    //启动球类游戏
    public void start(Ball ball) {
        ball.play();
    }
}

//抽取父类
class Ball {
    public void play() {
        System.out.println();
    }
}

class BasketBall2 extends Ball {
    @Override
    public void play() {
        System.out.println("开始篮球游戏...");
    }
}

class Football2 extends Ball {
    @Override
    public void play() {
        System.out.println("开始篮球游戏...");
    }
}

//1.必不可少的第一步
class PingPong2 extends Ball {
    @Override
    public void play() {
        System.out.println("开始乒乓球游戏...");
    }
}

