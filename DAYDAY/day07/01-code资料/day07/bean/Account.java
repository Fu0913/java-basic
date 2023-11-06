package com.briup.day07.bean;

//封装步骤1：private数据成员
//封装步骤2：提供public get|set方法
public class Account {
    //权限修饰符：public protected 默认 private
    //默认修饰符: 同一个包 不同类的成员方法中，都可以使用
    private String id;

    //private: 当前类的成员方法内部可以使用(类内)
    private double balance = 100;

    // 一般都要提供无参构造方法
    //构造方法(构造器)
    public Account() {
        System.out.println("Account() ...");
    }
    public Account(String id) {
        System.out.println("Account(String) ...");
        this.id = id;
    }
    // 借助其他构造器 实现 当前构造功能
    public Account(double balance) {
        // Account(String,double);
        this(null,balance);

        System.out.println("in Account(double) ...");
    }
    public Account(String id,double balance) {
        System.out.println("Account(String,double) ... balance: " + this.balance);
        this.id = id;
        this.balance = balance;
    }

    //普通成员方法
    public void setId(String id) {
        // 成员变量 和 局部变量 同名时，就近原则决定 局部变量优先级更高
        // 如果想要访问成员变量 可以使用 this.成员变量
        this.id = id;
    }
    public void setBalance(double balance) {
        //this: 对象(当前方法的调用者)的引用
        //  哪个对象调用该方法，this就指向哪个对象
        this.balance = balance;
        System.out.println(this);
    }

    //Alt+Insert 自动不全get|set代码

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    //提供disp方法，输出账户基本属性信息
    public void disp() {
        //如果局部变量和成员变量 不重名，如何去访问成员变量
        //  直接使用  成员变量名 即可, 系统默认会加上 this.成员变量名

        System.out.println("id: " + this.id + ", balance" + balance);
    }
}
