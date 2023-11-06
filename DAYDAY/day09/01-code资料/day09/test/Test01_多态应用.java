package com.briup.day09.test;

//不使用多态，进行系统功能扩展
public class Test01_多态应用 {
    public static void main(String[] args) {
        Game g = new Game();
        g.start(new BasketBall());
        g.start(new Football());

        g.start(new PingPong());
    }
}

//篮球类
class BasketBall {
    public void play() {
        System.out.println("开始篮球游戏...");
    }
}

//足球类
class Football {
    public void play() {
        System.out.println("开始足球游戏...");
    }
}

//第一步：新增乒乓球类
class PingPong {
	public void play() {
		System.out.println("开始乒乓球游戏...");
	}
}

//定义游戏类
class Game {
    //启动篮球游戏
    public void start(BasketBall basketBall) {
        basketBall.play();
    }

    //启动足球游戏
    public void start(Football football) {
        football.play();
    }

    //第二步：Game类新增重载start方法
    public void start(PingPong pingpong) {
    	pingpong.play();
    }
}
