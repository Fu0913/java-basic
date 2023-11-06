package com.briup.day09.test;

public class Test05_转型 {

    //类型转换过程中的 转换异常
    public static void main(String[] args) {
        Base b1 = new Derived();
        Base b2 = new Fork();

        Derived d = (Derived) b1;
        d.disp();

        Fork f = (Fork)b2;
        f.out();

        System.out.println("-----------");

        //      Fork --> Derived    error
        //Derived d2 = (Derived) b2;
        if(b2 instanceof Derived) {
            System.out.println("b2 is Derived");
            Derived d2 = (Derived) b2;
            d2.disp();
        }else if(b2 instanceof Fork) {
            System.out.println("b2 is Fork");
            Fork f2 = (Fork) b2;
            f2.out();
        }

    }

    //向下转型测试
    public static void main02(String[] args) {
        Base b = new Derived();

        //Derived d = b;error
        //向下转型 必须 强制类型转换
        Derived d = (Derived)b;

        System.out.println(d.n);
        System.out.println(d.v);
        d.show();
        d.disp();
    }

    //向上转型测试
    public static void main01(String[] args) {
        //1.向上转型 默认，直接成功
        Base b1 = new Derived();

        //2.操作成员变量：编译看左边 (父类), 运行看左边 (父类)
        System.out.println(b1.n);   // 1

        //System.out.println(b1.v); error

        //3.操作成员方法：编译看左边 (父类), 运行看右边 (子类重写)
        b1.show();
        //b1.disp();    error
    }
}

//定义基类
class Base {
    int n = 1;

    public void show() {
        System.out.println("in Base, n: " + n);
    }
}

class Fork extends Base {
    public void out() {
        System.out.println("in Fork, n：" + n);
    }
}

//定义派生类
class Derived extends Base {
    //新增成员
    int n = 2;	//同名成员
    int v = 20;

    //重写方法
    public void show() {
        System.out.println("in Derived, n: " + n);	//this.n > super.n
        System.out.println("in Derived, v: " + v);
    }

    //新增方法
    public void disp() {
        System.out.println("in Derived, v: " + v);
    }
}
