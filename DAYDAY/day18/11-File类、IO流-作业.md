## 第十一章  File类、IO流-作业

# 一、File 类

## 1.基础问答

以下方法都来自于**java.io.File**类，请简述它们的作用。

```java
public String getAbsolutePath(); 
public String getPath(); 
public String getName(); 
public long length();
public boolean exists();
public boolean isFile();
public boolean isDirectory();
public boolean createNewFile(); 
public boolean mkdir(); 
public boolean mkdirs(); 
public boolean delete();
```

## 2.编程题

请根据注释中的功能要求和提示补全代码，实现功能。

```java
import java.io.File;

public class Test012_ListFiles {
    public static void main(String[] args) {
        // 目录路径
        String path = "D:/";
        // 创建目录对象
        File dir = new File(path);
		// 请在此处补全代码，列出D盘根目录下所有后缀为txt或doc的文件
        // 注意：1、排除掉目录；2、显示出每个文件的绝对路径
        
    }
}
```

# 二、IO流

## 1.基础问答

根据数据的流向，可以将流分为哪些类型？简述它们的特点。

## 2.基础问答

根据每次处理数据的单位，可以将流分为哪些类型？简述它们的特点。

## 3.基础问答

JDK 为每种类型的流提供了抽象类以定义标准和规范，请说出他们分别是哪些类？

## 4.基础问答

InputStream类中定义了三个用于读取字节数据的方法，请回答以下问题：

-   1、简述每个方法的作用以及参数的含义
-   2、三个方法均为int类型返回值，这三种返回值代表的含义有何异同点？

```java
int read(); 
int read(byte b[]);
int read(byte b[], int off, int len);
```

## 5.基础问答

请回答在什么情况下适合用字节流读写文件？什么情况下适合用字符流读写文件？

## 6.基础问答

内存缓冲流的优势有哪些？

## 7.编程题

请按要求完成程序编写，部分代码已给出，请完成剩余部分。

-   将一张图片复制10份，放置在同目录下
-   源文件名为img.jpg，输出文件命名为img_copy1.jpg、img_copy2.jpg……img_copy10.jpg
-   选择合适的流对象实现功能，要求考虑到性能优化
-   严格遵循IO流的使用规范，进行资源的释放，避免内存泄漏

```java

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test027_MultipleCopy {

	public static void main(String[] args) {
		// 源文件所在路径
		String dirPath = "D:/test";
		// 源文件名称
		String fileName = "img.jpg";
		// 复制数量
		int number = 10;
		// 完成剩余代码编写
        // ...
	}
}
```

## 8.编程题

编程实现：如果现在有一款只能试用10次的软件，超过10次之后就需要提醒用户购买正版软件。（程序运行一次，使用次数就要减一次）

> 提示：将试用的次数写到一个文件中，每次启动时对其进行读取并进行判断。

## 9.编程题 

编写两个方法，分别实现如下功能：

-   save()方法：创建三个Person类型对象，将它们使用序列化手段写入本地文件中持久化存储
-   load()方法：将save()方法中保存的Person对象读取出来，打印输出属性

```java
package com.briup.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test029_ObjectStream {
	
	private final static String FILE_PATH = "D:/test/obj_file";

	public static void save() {
		// 补全代码
	}
	
	public static void load() {
		// 补全代码
	}
	
	public static void main(String[] args) {
		save();
		load();
	}
}

class Person implements Serializable {
	
	private static final long serialVersionUID = 4258798319750620830L;
	private String name;
	private String gender;
	public Person() {
	}
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
}
```

## 10.编程题

编写程序，实现将一个文件从GBK编码转换为UTF-8编码。

```java
package com.briup.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test0210_CharsetConvertion {
	
	public static void main(String[] args) {
		// 源文件编码格式
		String srcEncoding = "GBK";
		// 要转换的编码格式
		String distEncoding = "UTF-8";
		// 目录路径
		String dirPath = "D:/test";
		// 源文件名
		String fileName = "source.txt";
		// 创建目录对象
		File dir = new File(dirPath);
		// 创建源文件对象
		File source = new File(dir, fileName);
		// 补全代码，实现功能
        // ...
	}
}
```
