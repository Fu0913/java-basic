package com.briup.io.day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test0212_Properties {
    public static void main(String[] args) throws IOException {
        // 读取配置文件的属性

        // 声明流
        FileInputStream fis = new FileInputStream("src/dir/db.properties");

        // Properties
        Properties properties = new Properties();
        properties.load(fis);

        String driver = properties.getProperty("driver");
        System.out.println("driver = " + driver);
        String url = properties.getProperty("url");
        System.out.println("url = " + url);
        String username = properties.getProperty("username");
        System.out.println("username = " + username);
        String password = properties.getProperty("password");
        System.out.println("password = " + password);

        Set<String> strings = properties.stringPropertyNames();
        for (String name : strings) {
            String property = properties.getProperty(name);
            System.out.println("property = " + property);
        }


        // 往配置文件写属性
        properties.setProperty("date", "2023-11-1");
        properties.setProperty("name", "chris");
        // 声明输出流
        FileOutputStream fos = new FileOutputStream("src/dir/db.properties");
        properties.store(fos, "测试输出属性到配置文件");

        // 关闭资源
        fos.close();
        fis.close();
    }
}
