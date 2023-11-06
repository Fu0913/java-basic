package com.briup.day08.test;

public class Test02_Override {
    public static void main(String[] args) {
        Employee.sFun();
        Programmer.sFun();
        Manager.sFun();

        //父类对象 调用 doWork方法
        Employee e = new Employee("008", "larry");
        e.doWork();

        System.out.println("------------");

        //程序员子类对象 调用 重写方法
        Programmer p = new Programmer("010", "kevin", "初级");
        p.doWork();

        System.out.println("------------");

        //经理子类 调用 重写方法
        Manager m = new Manager("006", "robin", 201.5);
        m.doWork();
    }
}

class Employee {
    private String id;
    private String name;

    //构造方法
    public Employee() {}
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //父类权限小
    protected void doWork() {
        System.out.println("员工 " + this.name + " 开始一天的工作");
    }

    public static void sFun() {
        System.out.println("in 父类,static fun ...");
    }
}

//经理 子类
class Manager extends Employee {
    //奖金
    private double bonus;

    public Manager() {
        super();
    }
    public Manager(String id, String name, double bonus) {
        super(id, name);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void doWork() {
        //super.doWork();
        System.out.println("我是经理，有津贴 " + bonus + ", 开始工作：安排部门员工任务");
    }

    //@Override
    // 静态方法不能重写
    public static void sFun() {
        System.out.println("in 子类,static fun ...");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name=" + super.getName()
                + ",id=" + super.getId()
                + ",bonus=" + bonus +
                '}';
    }
}

//程序员类 子类
class Programmer extends Employee {
    private String grade;

    public Programmer() {
        //super();
    }
    public Programmer(String id, String name, String grade) {
        super(id, name);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    //重写doWork方法
    @Override
    public void doWork() {
        //super.doWork();
        System.out.println("我是程序员，级别为" + grade + ", 开始工作：写代码");
    }
}
