package com.briup.day07.test;

import java.util.Arrays;
//静态导入，格式 import static 包名.类名.static成员名(成员变量、成员方法);
import static java.util.Arrays.sort;

public class Test06_静态导入 {
    public static void main(String[] args) {
        int[] arr = {6,2,1,3,5,7};

        //Arrays.sort(arr);
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
