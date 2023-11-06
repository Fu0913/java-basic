package com.briup.homework.day16;

import java.util.Random;

/*
假设现在有两个⽤户账户A和B，每个账户都有⼀定的余额，现在需要实现⼀个线程安全的转账功能：
即⼀个⽤户可以将⼀定的⾦额转⼊到另⼀个⽤户账户中，具体要求如下：
    1. ⽤户可以同时进⾏多次转账操作，每次转账的⾦额必须⼤于0，同时转出账户余额必须⼤于等于转账⾦额。
    2. 转账过程中，需要对转出账户和转⼊账户加锁，保证同时只能有⼀个线程对某个账户进⾏转账操作。
    3. 在进⾏转账操作时，需要按照账户名称的字典序进⾏排序，保证转账过程中的资源占⽤顺序⼀致，避免死锁的出现。
    4. 转账操作完成后，需要释放相应的锁，并输出转账的⾦额和最新的账户余额。
 */
public class Test07 {
    public static void main(String[] args) {
        // 创建两个账户
        Account a = new Account("A", 1000.0);
        Account b = new Account("B", 1000.0);

        Random random = new Random();

        for(int i = 0; i < 10; i++) {
            Thread th = new Thread() {
                @Override
                public void run() {
                    double amout = random.nextDouble() * 100;

                    //根据取值范围 进行 相互转账
                    //如果 随机数为 (30,80) 则A向B转账
                    if(amout > 30 && amout < 80) {
                        a.transfer(b,amout);
                    }else {//如果 随机数为 [0,30)或(80,100) 则A向B转账
                        b.transfer(a,amout);
                    }

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            //启动线程
            th.start();
        }

    }
}

class Account {
    private String name; // 账户名称
    private double balance; // 账户余额

    public Account() {}

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }

    // 存款
    public void deposit(double amount) {
        balance += amount;
    }
    // 取款
    public void withdraw(double amount) {
        balance -= amount;
    }

    // 转账
    public void transfer(Account to, double amount) {
        // 按照账户名称的字典序进⾏排序，保证转账过程中的资源占⽤顺序⼀致，避免死锁的出现
        Account mutex01 = (name.compareTo(to.getName()) < 0) ? this : to;
        Account mutex02 = (name.compareTo(to.getName()) < 0) ? to : this;

        //获取线程名
        String name = Thread.currentThread().getName();

        //为了避免死锁，两把锁的 上锁次序 要保持一致
        synchronized (mutex01) {
            synchronized (mutex02) {
                // 转出账户余额必须⼤于等于转账⾦额
                if (balance >= amount) {
                    //当前账户 取款
                    withdraw(amount);
                    //往另一账户 存款
                    to.deposit(amount);

                    System.out.println(name + "线程: from " + this.name + " to " + to.getName() + " 转账: " + amount);
                    System.out.println("转账成功后，"+ this.name + "余额: " + this.balance + " " +  to.name + "余额: " + to.balance);
                }else {
                    System.out.println(name + "线程: from " + this.name + " to " + to.getName() + " 转账失败：转账金额大于账户余额");
                    System.out.println("转账金额: " + amount + " 账户余额: " + balance);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
