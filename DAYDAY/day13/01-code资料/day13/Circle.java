package com.briup.day13;

//定义泛型类
public class Circle<T,E> {
    //x,y   radius
    private T x;
    private T y;
    private E radius;

    public Circle() {}
    public Circle(T x, T y, E radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public T getX() {
        return x;
    }
    public void setX(T x) {
        this.x = x;
    }
    public T getY() {
        return y;
    }
    public void setY(T y) {
        this.y = y;
    }
    public E getRadius() {
        return radius;
    }
    public void setRadius(E radius) {
        this.radius = radius;
    }

    //获取周长
    public double getLength() {
        Double r = 0.0;
        if(radius instanceof Double) {
            r = (Double)radius;
        }
        return 2*3.14*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
}
