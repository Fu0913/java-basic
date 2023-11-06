package com.briup.day07;

/**
 * @ClassName: Test05_CarTest
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/17 08:23
 * @Version: v1.0
 */
public class Test05_CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "白色";
        car.brand = "BYD";
        car.price = 200000.0;
        car.show();

        car.forward();
        car.back();
        car.change();
    }
}

class Car {
    String color;
    String brand;
    double price;

    public void forward() {
        System.out.println("前进");
    }

    public void back() {
        System.out.println("后退");
    }

    public void change() {
        System.out.println("转弯");
    }

    public void show() {
        System.out.println(color);
        System.out.println(brand);
        System.out.println(price);
    }
}