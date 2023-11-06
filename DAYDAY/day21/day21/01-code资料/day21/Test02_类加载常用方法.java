package com.briup.day21;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class Test02_类加载常用方法 {
    public static void main(String[] args) throws IOException {

        //1.获取系统类加载器
        //ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //2.获取配置文件对应IO流
        //  注意：配置文件要和类 放在一起(使用相对路径)
        InputStream is =
                Test02_类加载常用方法.class.getResourceAsStream("jdbc.properties");
        //InputStream is = systemClassLoader.getResourceAsStream("jdbc.properties");

        //System.out.println("is: " + is);

        //3.使用Properties对象加载配置文件
        Properties prop = new Properties();
        prop.load(is);

        //4.解析配置文件
        Set<String> keys = prop.stringPropertyNames();
        for(String key : keys) {
            System.out.println(key + ": " + prop.getProperty(key));
        }

    }
}
