package com.briup.day10.homework;

/**
 * @ClassName: Test1_5_ShapeTest
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/19 10:10
 * @Version: v1.0
 */
public class Test1_5_ShapeTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Red", 2.0, 3.0);
        Shape circle = new Circle("Blue", 5);
        System.out.println(rectangle.getColor());
        System.out.println("Area: " + rectangle.area());
        System.out.println();
        System.out.println(circle.getColor());
        System.out.println("Area: " + circle.area());
    }
}

abstract class Shape {
    public String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double area();

    public String getColor() {
        return color;
    }
}

class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double radius;

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}