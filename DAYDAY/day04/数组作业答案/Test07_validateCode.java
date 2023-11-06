package com.briup.day04;

import java.util.Arrays;

/**
 * @ClassName: Test07_validateCode
 * @Description: 随机产生一个长度为4位的验证码，包含大小写字母以及数字
 * @Author: songjl
 * @Date: 2023/10/13 14:08
 * @Version: v1.0
 */
public class Test07_validateCode {
    public static void main(String[] args) {
        // 创建存放验证码的数组
        char[] validateCode = new char[4];

        // 创建存放大小写字母以及数字数组
        char[] data = new char[62];

        // 给data输出添加元素值，提示：通过循环实现
        // 添加大写字母
        char c = 'A';
        for (int i = 0; i < 26; i++) {
            data[i] = c++;
        }
        // 添加小写字母
        c = 'a';
        for (int i = 26; i < 52; i++) {
            data[i] = c++;
        }
        // 添加数字
        c = '0';
        for (int i = 52; i < 62; i++) {
            data[i] = c++;
        }
        System.out.println(Arrays.toString(data));
        
        // 生成验证码
        for (int i = 0; i < validateCode.length; i++) {
            // [0, 62)
            int randomArr = (int) (Math.random() * data.length);// 从data数组中随机索引
            char randomChar = data[randomArr];// 随机字符
            validateCode[i] = randomChar;
        }
        System.out.println(Arrays.toString(validateCode));
    }
}
