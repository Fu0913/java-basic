# static-答案

## 1.static

**题目要求：**

请解释什么是static关键字，并列举至少3种用法。

## 2.静态成员变量

**题目要求：**

请从以下角度思考静态成员变量和非静态成员变量的区别：

1. 存储位置：
2. 生命周期：
3. 出现顺序：
4. 调用方式：
5. 初始化时机：
6. 内存占用：
7. 共享：

## 3.静态方法

**题目要求：**

请简述static方法和非static方法有什么区别？什么情况下应该使用static方法？

## 4.代码块

**题目要求：**

请简述匿名代码块和静态代码块的作用

## 5.继承static

**题目要求：**

请回答在Java中，能否继承static成员变量或方法？

## 6.程序分析

**题目要求：**

请阅读并分析以下三个案例中，程序启动运行的结果。

**案例一：**

```Java
class Test {
    public Test() {
        System.out.println("构造器");
    }

    public void info() {
        System.out.println("info");
    }

    static {
        System.out.println("test static 1");
    }

    public static void main(String[] args) {
        new Test().info();
    }

    {
        System.out.println("代码块");
    }

    static {
        System.out.println("test static 2");
    }
}
```


**案例二：**

```Java
public class Test06 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

class Parent {
    static {
        System.out.println("静态代码块Parent");
    }

    {
        System.out.println("构造代码块Parent");
    }

    public Parent() {
        System.out.println("构造方法Parent");
    }
}

class Child extends Parent {
    static {
        System.out.println("静态代码块Child");
    }

    {
        System.out.println("构造代码块Child");
    }

    public Child() {
        System.out.println("构造方法Child");
    }
}
```

**案例三：**

```Java
class B {
    public static B b = new B();
    public static B b2 = new B();

    {
        System.out.println("构造块");
    }

    static {
        System.out.println("静态块");
    }
}
public class Test06 {
    public static void main(String[] args) {
        B b = new B();
    }
}
```

## 7.单例模式

**题目要求：**

请解释什么是单例模式，并提供一个使用静态变量实现单例模式的例子。

## 8.统计次数

**题目要求：**

编写一个Java类，实现如下功能：

-   该类能够自动记录被实例化的次数（即创建过该类多少对象）
-   能够随时通过调用某个方法，获取到这个数值
