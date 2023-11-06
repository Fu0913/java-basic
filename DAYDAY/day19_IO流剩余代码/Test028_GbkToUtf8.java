package com.briup.io.day03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test028_GbkToUtf8 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/chris_songjl/Desktop/test.txt");
        int read;
        while ((read = fileReader.read()) != -1) {
            System.out.print((char)read);
        }
        fileReader.close();
    }
}