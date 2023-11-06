package com.briup.day07;

/**
 * @ClassName: StudentManagement
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/17 10:03
 * @Version: v1.0
 */

import java.util.Arrays;
import java.util.Scanner;

// 学生管理系统类
public class StudentManagement {
    // 学生对象数组
    private Student[] stus;
    // 实际学生个数
    private int counter;
    // 键盘录入对象
    private Scanner in;

    // 无参构造器：默认容量100
    public StudentManagement() {
        stus = new Student[100];
        in = new Scanner(System.in);
    }

    // 有参构造器：size表示初始容量
    public StudentManagement(int size) {
        stus = new Student[size];
        in = new Scanner(System.in);
    }

    // 输出 操作提示
    public void prompt() {
        System.out.println("********************");
        System.out.println("*Student Management*");
        System.out.println("********************");
        System.out.println("* 1)Add");
        System.out.println("* 2)Delete");
        System.out.println("* 3)Update");
        System.out.println("* 4)Select");
        System.out.println("* 5)SelectAll");
        System.out.println("* 0)Quit");
        System.out.println("********************");
        System.out.print("Please choose your operate:");
    }

    // 根据用户录入的学生名称，找到学生在数组中的索引返回
    private int findStudent() {
        int index = -1;
        String name;
        System.out.print("Please input name:");
        // 从键盘获取一个字符串
        name = in.next();
        // 请补全下面核心代码
        // ...
        for (int i = 0; i < counter; i++) {
            // stus[i].getName() 学生名字
            if (name.equals(stus[i].getName())) {
                index = i;
                break;
            }
        }
        return index;
    }

    // 下面就是增删改查 四个方法
    public void addStudent() {
        String name;
        int age;
        String gender;
        Student s;

        // 判断 管理系统容量是否 已满
        if (counter >= stus.length) {
            System.out.println("Add failure,too many student!");
            // 扩容 数组拷贝，System.arrayscopy方法 Arrays.copyof方法
            stus = Arrays.copyOf(stus, stus.length << 2);
            // return;
        }
        System.out.print("Please input name:");
        name = in.next();
        System.out.print("Please input age:");
        age = in.nextInt();
        System.out.print("Please input gender:");
        gender = in.next();
        s = new Student(name, age, gender);
        // 关键代码
        stus[counter] = s;
        counter++;
        System.out.println("Add student success!");
    }

    // 请补全下面代码
    public void deleteStudent() {
        int index = findStudent();
        if (index == -1) {
            System.out.println("学生信息不存在");
            return;
        }
        // stus[index] = null;
        for (int i = index; i < counter; i++) {
            // 后一个元素替换前一个元素
            stus[index] = stus[index + 1];
        }
        counter--;
        System.out.println("Delete student success!");
    }

    public void updateStudent() {
        String name;
        int age;
        String gender;
        Student s;
        int index = findStudent();
        if (index == -1) {
            System.out.println("学生信息不存在");
            return;
        }

        System.out.print("Please input new name:");
        name = in.next();
        System.out.print("Please input new age:");
        age = in.nextInt();
        System.out.print("Please input new gender:");
        gender = in.next();
        s = new Student(name, age, gender);
        stus[index] = s;
        System.out.println("Update student success!");
    }

    public void selectStudent() {
        int index = findStudent();
        if (index == -1) {
            System.out.println("学生信息不存在");
            return;
        }
        Student stu = stus[index];
        System.out.print("name:" + stu.getName());
        System.out.print(",age:" + stu.getAge());
        System.out.println(",gender:" + stu.getGender());
    }

    public void selectAllStudent() {
        // 学生数组stus 对应学生个数counter
        for (int i = 0; i < counter; i++) {
            System.out.println(stus[i]);
        }
    }

    public static void main(String[] args) {
        // 实例化对象
        StudentManagement sm = new StudentManagement();
        // 用户操作标志
        int option = -1;
        Loop:
        while (true) {
            // 打印提示信息
            sm.prompt();
            // 获取用户操作
            option = sm.in.nextInt();
            if (option < 0 || option > 5)
                continue;
            switch (option) {// byte char short int
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.deleteStudent();
                    break;
                case 3:
                    sm.updateStudent();
                    break;
                case 4:
                    sm.selectStudent();
                    break;
                case 5:
                    sm.selectAllStudent();
                    break;
                case 0:
                    break Loop;
            }// end switch
        } // end while
        System.out.println("游戏结束, byebye");
    }// end main
}// end class

class Student {
    // 属性
    private String name;
    private int age;
    private String gender;

    // 默认|无参构造器
    public Student() {
    }

    // 有参构造器
    public Student(String name, int age, String gender) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // get|set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}
