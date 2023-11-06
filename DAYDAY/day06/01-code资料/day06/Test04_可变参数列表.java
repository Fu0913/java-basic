package com.briup.day06;

public class Test04_可变参数列表 {

    // 函数形参，可以同时包含 可变参数和普通参数，
    // 但两者同时出现的时候，可变参数必须放到最右侧！
    public static int getSum(int len, int... arr) {
        int sum = 0;
        for(int i = 0; i < len; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //getSum测试
    public static void main(String[] args) {
        int s = getSum(3,1,2,3,4);
        System.out.println(s);
    }

    //可变参数列表固定格式：数据类型... 变量名;
    // 可变参数列表 本质上就是一个 一维数组(长度不固定 0-n)
    public static void out(int... a) {
        // [I@4554617
        System.out.println(a);
        System.out.println("长度: " + a.length);
    }

    public static void fun(int[] arr) {
        System.out.println("in fun...");
    }

    //基础测试
    public static void main01(String[] args) {
        //可变参数列表 更加灵活
        out();
        out(1);
        out(1,2);
        int[] arr = {3,4,5};
        out(arr);

        //只能接收 对应类型 实际参数 int[] 数组
        fun(arr);
        //fun(1,2,3);   error
        //fun();        error
    }
}
