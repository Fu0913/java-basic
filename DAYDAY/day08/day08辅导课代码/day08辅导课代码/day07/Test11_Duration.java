package com.briup.day07;

/**
 * @ClassName: Test11_Duration
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/17 08:42
 * @Version: v1.0
 */
public class Test11_Duration {
    public static void main(String[] args) {
        // 借助三参构造器 实例化对象
        Duration d1 = new Duration(1, 1, 1);
        // 获取总秒数
        int totalSeconds = d1.getTotalSeconds();
        System.out.println("1小时1分钟1秒：" + totalSeconds);
        System.out.println("------------------");
        // 借助单参构造器 实例化对象
        Duration d2 = new Duration(3660);
        // 获取小时
        int hour = d2.getHour();
        System.out.println("hour = " + hour);
        System.out.println("------------------");
        // 输出对象属性信息及总描述信息
        d2.disp();
    }
}

class Duration {
    private int hour;
    private int min;
    private int sec;

    public Duration() {

    }

    public Duration(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Duration(int totalSeconds) {
        this.hour = totalSeconds / 3600;
        this.min = totalSeconds % 3600 / 60;
        this.sec = totalSeconds % 60;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public int getTotalSeconds() {
        int seconds = hour * 3600 + min * 60 + sec;
        return seconds;
    }

    public void disp() {
        System.out.println(hour + ":" + min + ":" + sec);
    }
}