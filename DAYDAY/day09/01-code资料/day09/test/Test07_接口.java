package com.briup.day09.test;

public class Test07_接口 {
    public static void main(String[] args) {
        System.out.println(IAction.NUM);

        //IAction.NUM = 20;

        //一般情况下，使用接口的引用指向 实现类对象
        // 多态 依旧 有效
        IAction ac = new ActionImpl();
        ac.start();
        ac.end();

        if(ac instanceof ActionImpl) {
            ActionImpl action = (ActionImpl) ac;
            action.disp();
        }

        //ac.disp();  error
    }
}

//实现类   借助 implements 实现
// 接口和类 是 实现关系
class ActionImpl implements IAction {
    @Override
    public void start() {
        System.out.println("in start() ...");
    }

    @Override
    public void end() {
        System.out.println("in end() ...");
    }

    public void disp() {
        System.out.println("in disp() ...");
    }
}

//接口
interface IAction {
    //public static final int NUM = 10;
    int NUM = 10;

    //public abstract void start();
    void start();

    public abstract void end();
}
