package com.briup.day18;

import java.io.*;

public class Test05_缓冲字节流 {
    //使用缓冲字节流 + 小数组拷贝 图片文件
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try{
            //1.实例化流对象
            bis = new BufferedInputStream(
                    new FileInputStream("src/dir/01.png"));

            //os = new FileOutputStream("src/dir/02.png");
            bos = new BufferedOutputStream(
                    new FileOutputStream("src/dir/02.png"));

            //2.逐个字节拷贝
            long start = System.currentTimeMillis();

            int len = -1;
            byte[] buff = new byte[1024];
            while((len = bis.read(buff)) != -1) {
                bos.write(buff,0,len);
            }

            long end = System.currentTimeMillis();
            System.out.println("拷贝完成,耗时: " + (end-start));
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            //3.关闭资源
            try {
                //如果同时存在增强流(缓冲流)和基础流(文件流)，
                // 只需要关闭增强流即可，系统会自动关闭 基础流
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //使用缓冲字节流 逐个字节拷贝 图片文件
    public static void main02(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try{
            //1.实例化流对象
            is = new FileInputStream("src/dir/01.png");
            bis = new BufferedInputStream(is);

            //os = new FileOutputStream("src/dir/02.png");
            bos = new BufferedOutputStream(
                    new FileOutputStream("src/dir/02.png"));

            //2.逐个字节拷贝
            long start = System.currentTimeMillis();
            int v = -1;
            while((v = bis.read()) != -1) {
                bos.write(v);
            }
            long end = System.currentTimeMillis();
            System.out.println("拷贝完成,耗时: " + (end-start));
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            //3.关闭资源
            try {
                //如果同时存在增强流(缓冲流)和基础流(文件流)，
                // 只需要关闭增强流即可，系统会自动关闭 基础流
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //使用基础文件流 逐个字节拷贝 图片文件
    public static void main01(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        try{
            //1.实例化流对象
            is = new FileInputStream("src/dir/01.png");
            os = new FileOutputStream("src/dir/02.png");

            //2.逐个字节拷贝
            long start = System.currentTimeMillis();
            int v = -1;
            while((v = is.read()) != -1) {
                os.write(v);
            }
            long end = System.currentTimeMillis();
            System.out.println("拷贝完成,耗时: " + (end-start));
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            //3.关闭资源
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
