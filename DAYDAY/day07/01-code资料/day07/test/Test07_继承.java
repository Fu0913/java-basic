package com.briup.day07.test;

public class Test07_继承 {
    public static void main(String[] args) {
        Son s = new Son();
        s.farming();
        s.fishing();
        s.skidding();
    }
}

class Grandpa {
    public void farming() {
        System.out.println("爷爷喜欢种地");
    }
}

class Father extends Grandpa {
    // Father类 继承父类中 farming方法

    //子类新增方法
    public void fishing() {
        System.out.println("爸爸爱钓鱼");
    }
}

class Son extends Father {
    // Son类 继承父类中 farming方法 和 fishing方法

    //子类新增方法
    public void skidding() {
        System.out.println("孙子爱轮滑");
    }
}
