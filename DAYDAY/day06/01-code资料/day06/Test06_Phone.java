package com.briup.day06;

//public修饰类：则该文件名必须和当前类名一致
//自定义基础类
class Phone {
    //品牌 价格
    String brand;
    double price;

    //显示自己信息
    public void show() {
        System.out.println(brand);
        System.out.println(price);
    }

    //打电话  发短信
    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage(String name, String msg) {
        System.out.println("发短信给 " + name + ": " + msg);
    }
}

public class Test06_Phone {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.brand = "Mate60";
        p1.price = 5999.9;

        // 类的全包名@堆空间开辟内存的地址值
        //com.briup.day06.Phone@4554617c
        System.out.println(p1);

//        System.out.println(p1.brand);
//        System.out.println(p1.price);
        p1.show();

        p1.call();

        p1.sendMessage("老莫","吃鱼");
    }
}
