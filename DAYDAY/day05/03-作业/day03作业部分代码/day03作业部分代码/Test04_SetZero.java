package com.briup.day03;

/**
 * @ClassName: Test04_SetZero
 * @Description: 指定位置设置为0
 * @Author: songjl
 * @Date: 2023/10/10 17:24
 * @Version: v1.0
 */
public class Test04_SetZero {
    public static void main(String[] args) {
        /*
            0000 1010
            1111 1101
            0000 0010


            0000 1000

            第一个数 & 第二个数
            如果第二个数对应位置上是0， 那么结果0
            如果第二个数对应位置上是1， 那么结果就是第一个数对应位置的值
         */
        int r = setZero(10,2);
        System.out.println("r: " + r);
    }

    // ⽅法声明如下：
    public static int setZero(int v,int n){
        // 提示：使⽤ ~ 及 & 及 <<
        // 补全代码
        int mask = ~(1 << (n - 1));
        int result = v & mask;
        return result;
    }
}
