package com.briup.day17;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Test06_File {
    //目录遍历操作
    public static void main(String[] args) {
        File f = new File("D:\\test\\dir");

        //遍历目录内容
        String[] list = f.list();
        for(String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------");
        File[] files = f.listFiles();
        for(File file : files) {
            System.out.println(file + " type: " + (file.isFile() ? "file" : "dir"));
        }

        System.out.println("--------------");

        File[] files2 = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                //过滤图片文件(.png结尾)
                if (file.isFile()) {
                    String name = file.getName();
                    if(name.endsWith(".png"))
                        return true;
                }

                return false;
            }
        });
        for(File file : files2) {
            System.out.println(file);
        }

    }

    //创建和删除操作
    public static void main03(String[] args) throws IOException {
        File f = new File("D:\\test\\b.txt");
        System.out.println("是否存在: " + f.exists());

        if(f.exists() == false) {
            //创建一个文件
            boolean flag = f.createNewFile();
            System.out.println("创建结果: " + flag);
        }

        //删除文件
        f.delete();
        System.out.println("删除以后，是否存在: " + f.exists());

        File dir = new File("D:\\test\\dir");
        if(dir.exists() == false) {
            //创建目录
            dir.mkdir();
        }
        System.out.println("dir: " + dir.exists());

        System.out.println("-------------");
        File dir2 = new File("D:\\test\\dir1\\dir2");
        if(dir2.exists() == false) {
            //创建多级目录
            dir2.mkdirs();
        }
        System.out.println("dir2: " + dir2.exists());

        if(dir2.exists()) {
            dir2.delete();
        }

    }

    public static void main02(String[] args) {
        File f1 = new File("D:\\test\\a.txt");
        System.out.println("f1绝对路径: " + f1.getAbsolutePath());
        //获取文件长度(字节数量)
        System.out.println("f1.length: " + f1.length());

        //相对路径 相对 当前项目目录
        File f2 = new File("D:\\test\\b.txt");
//        File f2 = new File("D:\\test");
        System.out.println("f2绝对路径: " + f2.getAbsolutePath());
        System.out.println("f2.length: " + f2.length());
    }

    public static void main01(String[] args) {

        File f1 = new File("D:\\test\\a.txt");
        System.out.println("f1: " + f1);
        System.out.println("f1.exist: " + f1.exists());
        System.out.println("f1.isFile: " + f1.isFile());
        System.out.println("f1.isDirectory: " + f1.isDirectory());

        File f2 = new File("D:\\test");
        System.out.println("f2: " + f2);
        System.out.println("f2.exist: " + f2.exists());
        System.out.println("f2.isDirectory: " + f2.isDirectory());
    }
}
