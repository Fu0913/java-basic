package com.briup.day03;

/**
 * @ClassName: Test03
 * @Description: 指定位置设置为1
 * @Author: songjl
 * @Date: 2023/10/10 17:22
 * @Version: v1.0
 */
public class Test03_SetOne {
    public static void main(String[] args) {
        /*
            10: 0000 1010
                0000 0100

                0000 1110
            第一个数 | 第二个数
            第二个数对应位置是1，结果永远是1
            第二个数对应位置是0，结果永远是第一个数对应位置的值
         */
        int r = setBit(10,3);
        System.out.println("r: " + r);
    }

    // ⽅法声明如下：
    public static int setBit(int v,int n){
        // 提示：使⽤ | 及 <<
        // 补全代码
        int mask = 1 << (n-1);
        int result = v | mask;
        return result;
    }
}
