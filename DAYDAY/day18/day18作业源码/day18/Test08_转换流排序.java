package com.briup.homework.day18;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test08_转换流排序 {
    public static void main(String[] args) throws Exception {
        //1.读取gbk文件内容src/dir/gbk.txt
        FileInputStream fis = new FileInputStream("src\\dir\\gbk.txt");
        InputStreamReader isr = new InputStreamReader(fis,"gbk");
        //为了实现按行读取的功能，借助缓冲字符流实现
        BufferedReader br = new BufferedReader(isr);

        //2.按行读取文件内容
        String line = null;
        Map<Integer,String> map = new TreeMap<>();
        while((line = br.readLine()) != null) {
            //System.out.println(line);

            //3.拆分字符串，添加到 TreeMap集合中，实现自动排序
            String[] arr = line.split("[.]");
            map.put(Integer.parseInt(arr[0]),line);
        }

        //4.遍历集合
        Set<Integer> keys = map.keySet();
        for(Integer key : keys) {
            //System.out.println(key + "." + map.get(key));
            System.out.println(map.get(key));
        }

        //3.关闭流
        br.close();
    }
}
