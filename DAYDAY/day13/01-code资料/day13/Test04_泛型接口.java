package com.briup.day13;

public class Test04_泛型接口 {
    public static void main(String[] args) {
        Action<Integer> ac = new Action<Integer>() {
            @Override
            public Integer sum(Integer x, Integer y) {
                return x+y;
            }
        };
        int s = ac.sum(12, 23);
        System.out.println(s);

        System.out.println("------------");

        Action<Double> ac2 = new Action<Double>() {
            @Override
            public Double sum(Double x, Double y) {
                return x+y;
            }
        };
        System.out.println(ac2.sum(1.2,2.3));
    }
}

interface Action<T> {
    public abstract T sum(T x, T y);
}