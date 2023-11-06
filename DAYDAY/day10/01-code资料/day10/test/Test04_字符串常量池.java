package com.briup.day10.test;

//两道常见面试题
public class Test04_字符串常量池 {
    //final修饰的也是常量
    public static void main(String[] args) {
        String str = "ab";

        String s1 = "a";
        // String msg = new String("a"+"b");
        String msg = s1 + "b";
        System.out.println(msg == str);     //false

        final String s2 = "a";
        // String msg2 = "a" + "b";
        String msg2 = s2 + "b";

        System.out.println(msg2 == str);    //true
    }

    public static void main02(String[] args) {
        String s1 = "a";
        String s2 = "b";

        // 常量优化机制："a" 和 "b"都是字面值常量，借助 + 连接，其结果 "ab" 也被当作常量
        String s3 = "a" + "b";
        String s4 = "ab";

        System.out.println(s3.equals(s4));	// true
        System.out.println(s3 == s4);		// true

        System.out.println("-------------");

        String s5 = s1 + s2;
        System.out.println(s4.equals(s5));	// true
        System.out.println(s4 == s5);		// false

        System.out.println("-------------");

        String s6 = (s1 + s2).intern();
        System.out.println(s4.equals(s6));	// true
        System.out.println(s4 == s6);		// true
    }

    public static void main01(String[] args) {
        String s1 = "Hello";  // 字符串常量，放入常量池
        String s2 = "Hello";  // 直接引用常量池中的字符串对象
        System.out.println(s1 == s2);  // true，引用相同

        // 直接new String对象，不会将'World'放入常量池
        String s3 = new String("World");

        // 调用intern()方法,将'World'放入常量池，并返回常量池中的引用
        String s4 = new java.lang.String("World").intern();

        String s5 = "World";

        System.out.println(s3 == s4);  // false，引用不同
        System.out.println(s4 == s5);  // true，引用相同
    }
}
