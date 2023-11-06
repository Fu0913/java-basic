package com.briup.day04;

import java.util.Scanner;

public class Test04_While {

    //最大公约数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.键盘录入2个数
        System.out.println("input 2 num: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        //预处理
        if(a % b == 0){
            System.out.println("最大公约数：" + b);
            System.out.println("最小公约数：" + a);
            return;
        }else if(b % a == 0){
            System.out.println("最大公约数：" + a);
            System.out.println("最小公约数：" + b);
            return;
        }

        //2.区分两个数大小
        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;

        //3.辗转相除法
	    /*
				12   9   ==>   3
				{
					a.用max % min 得到 yu
						18 % 12 == 6
					b.如果yu值不为0
					则
						max = min;
						min = yu;
						再重复上述操作
					c.如果yu值为0
						则 最大公约数为min
						return 结束
				}
			*/
        int yu = max % min;
        while(yu != 0) {
            max = min;
            min = yu;

            yu = max % min;
        }

        System.out.println("最大: " + min);
        System.out.println("最小: " + a * b / min);
    }

    //基础案例
    public static void main01(String[] args) {
        //求1-5累加和

        int sum = 0;

        //1.初始化语句
        int i = 5;
        while(i >= 1) {
            //3.循环体语句
            //sum = sum + i;
            sum += i;

            //4.条件语句4
            i--;
        }

        System.out.println("sum: " + sum);
    }
}
