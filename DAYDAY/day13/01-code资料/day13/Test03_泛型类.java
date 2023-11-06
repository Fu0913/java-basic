package com.briup.day13;

public class Test03_泛型类 {
    public static void main(String[] args) {
        Circle<Integer,Double> c1 = new Circle<>();
        c1.setX(1);
        c1.setY(1);
        //Double r = 2;  error
        c1.setRadius(2.0);

        System.out.println(c1);

        Circle<Double,Integer> c2 =
                new Circle<>(2.0,2.0,2);
        System.out.println(c2);
    }
}
