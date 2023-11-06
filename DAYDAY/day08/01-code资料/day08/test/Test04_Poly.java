package com.briup.day08.test;

public class Test04_Poly {
    public static void main(String[] args) {
        Point p = new Circle(1,1,2);
        //System.out.println(p.x + " " + p.y);
        //System.out.println(p.radius);

        //调用的是 子类重写的方法
        p.show();

        System.out.println("----------");

        p = new TCircle(1,1,2,3);
        p.show();
    }
}

//父类：点
class Point {
    public int x;
    public int y;

    public Point() {}
    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public void show() {
        System.out.println("点 x: " + x + " y: " + y);
    }
}

//子类1：圆
class Circle extends Point {
    //半径
    public int radius;

    public Circle() {
        //super();
    }
    public Circle(int x,int y,int radius) {
        super(x,y);
        this.radius = radius;
    }

    //重写方法
    public void show() {
        System.out.println("Circle x: " + x 	//this.x
                + " y: " + super.y
                + " radius: " + radius);
    }
}

//子类2：椭圆
class TCircle extends Point {
    //水平半径
    private int xRadius;
    //竖直半径
    private int yRadius;

    public TCircle() {}
    public TCircle(int x,int y,int xr,int yr) {
        super(x,y);
        this.xRadius = xr;
        this.yRadius = yr;
    }

    //重写方法
    public void show() {
        System.out.println("TCircle x: " + x 	//this.x
                + " y: " + super.y
                + " xRadius: " + xRadius
                + " yRadius: " + yRadius);
    }
}
