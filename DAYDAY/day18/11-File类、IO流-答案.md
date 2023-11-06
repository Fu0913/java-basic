## 第十一章  File类、IO流-答案

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

**答案及解析：**

```java
//File绝对路径名字符串 
public String getAbsolutePath(); 
//File文件构造路径 
public String getPath(); 
//File文件或目录的名称 
public String getName(); 
//File文件或目录的长度 
public long length();
//判断文件或目录是否存在 
public boolean exists(); 
//判断是否是文件 
public boolean isFile(); 
//判断是否是目录 
public boolean isDirectory();
//当且仅当具有该名称的文件尚不存在时，创建一个新的空文件 
public boolean createNewFile(); 
//创建目录 
public boolean mkdir(); 
//创建多级目录 
public boolean mkdirs(); 
//文件或目录的删除 
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

**答案及解析：**

```java
import java.io.File;

public class Test012_ListFiles {
	public static void main(String[] args) {
		// 目录路径
		String path = "D:/";
		// 创建目录对象
		File dir = new File(path);
		// 获取该目录下的所有文件
		File[] files = dir.listFiles();
		// 遍历数组
		for (File file : files) {
			// 如果是文件则继续判断
			if (file.isFile()) {
				// 获取文件名称
				String fileName = file.getName();
				// 判断是否以.pdf或.md结尾
				if (fileName.endsWith(".pdf") || fileName.endsWith(".md")) {
					// 如果是则打印输出绝对路径
					System.out.println(file.getAbsolutePath());
				}
			}
		}
	}
}
```

# 二、IO流

## 1.基础问答

根据数据的流向，可以将流分为哪些类型？简述它们的特点。

**答案及解析：**

可以分为两种：

-   输入流：把数据从其他设备上读取到程序中的流
-   输出流 ：把数据从程序中写出到其他设备上的流

## 2.基础问答

根据每次处理数据的单位，可以将流分为哪些类型？简述它们的特点。

**答案及解析：**

可以分为两种：

-   字节流 ：以字节为单位（byte），读写数据的流，每次读取1字节

-   字符流 ：以字符为单位（char），读写数据的流，每次读取1字符（1-3字节不等，根据编码自动判断）

## 3.基础问答

JDK 为每种类型的流提供了抽象类以定义标准和规范，请说出他们分别是哪些类？

**答案及解析：**

-   InputStream：字节输入流
-   OutputStream：字节输出流
-   Reader：字符输入流
-   Writer：字符输出流

## 4.基础问答

InputStream类中定义了三个用于读取字节数据的方法，请回答以下问题：

-   1、简述每个方法的作用以及参数的含义
-   2、三个方法均为int类型返回值，这三种返回值代表的含义有何异同点？

```java
int read(); 
int read(byte b[]);
int read(byte b[], int off, int len);
```

**答案及解析：**

-   1、简述每个方法的作用以及参数的含义
    -   **read()**方法每次读取1字节
    -   **read(byte b[])**方法批量读取字节，将读取的数据存入**b**数组中，读取的最大长度取决于**b**数组的长度
    -   **read(byte b[], int off, int len)**方法批量读取字节，将读取的数据存入**b**数组从**[off]**开始的位置，最大读取**len**个字节
-   2、三个方法均为int类型返回值，这三种返回值代表的含义是否相同？如不相同，请说说各自的含义。
    -   不同之处在于，无参的**read()**方法返回值为读取到的字节值，有参的两个**read()**方法返回值均表示实际读到的字节数量
    -   相同之处在于，当返回-1时均表
    -   示已经读到了结束位置，无更多数据可读

## 5.基础问答

请回答在什么情况下适合用字节流读写文件？什么情况下适合用字符流读写文件？

**答案及解析：**

字节流可以读写所有类型文件，字符流只能读写文本类型文件。

>   文本类型文件：通常编辑时输入字符内容，写入时按照特定字符集进行编码，读取时按照特定字符集进行解码。可以大致理解为我们使用记事本可以打开看懂内容的文件，常见格式有.txt、.java、.xml、.md等。
>
>   非文本类型文件：不以字符编码进行写入和读取，以字节形式存储数据，通常需要使用特定方式或工具才能正确解析和查看其内容。例如.class、.doc、.jpg、.zip等。

-   对于文本类型文件，使用字节流和字符流均可，但字符流效率更高，使用更加方便。

-   对于非文本类型文件，只能使用字节流进行读写。

## 6.基础问答

内存缓冲流的优势有哪些？

**答案及解析：**

当我们需要进行IO操作时，通常会涉及到数据的读写操作，而这个读写操作通常是非常耗时的。为了优化这个过程，我们可以使用内存缓冲流（BufferedInputStream 和 BufferedOutputStream）。

内存缓冲流是一种高效的IO流，它可以通过创建内部缓冲区来减少实际的IO操作，提高读写数据的性能。内存缓冲流和普通的IO流不同，它可以将读取的数据暂存到内存中，等到缓冲区满了之后再一次性写入磁盘，这样就大大减少了实际IO操作的次数。

内存缓冲流还可以减少系统调用，因为在使用缓存流时，它会从缓冲区中读取和写入数据，而不是每次都调用底层的操作系统进行读写操作。这样可以减少系统调用的次数，从而提高IO性能。

另外，内存缓冲流还支持标记和重置操作，这个功能可以在需要反复读取同一个位置的数据时非常有用。另外，内存缓冲流也支持多种数据类型的读写操作，比如字节数组、字符数组、整型、长整型等等，使得读写数据变得更加灵活和方便。

总之，内存缓冲流的优势在于它能够提高IO性能、减少系统调用、支持标记和重置操作以及支持多种数据类型的读写操作，这些都使得IO操作变得更加高效和灵活。具体优势体现在如下几个方面：

1. 提高IO性能：缓存流使用内部缓冲区进行数据的读写，可以大大减少实际IO操作次数，从而提高IO性能。
2. 减少系统调用：缓存流内部维护了一个 byte 数组，每次实际读写数据时，都是从这个数组中读取和写入数据，而不是每次都调用底层的操作系统进行读写操作，从而减少了系统调用的次数。
3. 支持标记和重置：缓存流支持标记和重置操作，可以使用 mark() 方法在流中标记一个位置，然后使用 reset() 方法返回到这个位置，这个功能可以在需要反复读取同一个位置的数据时非常有用。
4. 支持多种数据类型：缓存流支持多种数据类型的读写操作，比如字节数组、字符数组、整型、长整型等等，使得读写数据变得更加灵活和方便。

## 7.字节流拷贝

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

**答案及解析：**

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
		String dirPath = "D:/test/img.jpg";
		// 源文件名称
		String fileName = "img.jpg";
		// 复制数量
		int number = 10;
		// 创建目录对象
		File dir = new File(dirPath);
		// 创建源文件对象
		File source = new File(dir, fileName);
		// 输入流对象
		InputStream inputStream = null;
		// 10个输出流对象，保存到数组中
		OutputStream[] outputStreams = new OutputStream[number];
		try {
			// 初始化输入流对象
			inputStream = new FileInputStream(source);
			// 初始化所有输出流对象
			for (int i = 0; i < outputStreams.length; i++) {
				// 拆分出文件名前缀和后缀两部分，将序号1~10拼接到左边文件名后边，再完整拼接起来
				String[] split = fileName.split("\\.");
				String prefix = split[0];
				String suffix = split[1];
				String name = prefix + "_copy" + (i + 1) + "." + suffix;
				// 创建输出文件对象
				File target = new File(dir, name);
				OutputStream os = new FileOutputStream(target);
				// 将输出流对象保存到数组中
				outputStreams[i] = os;
			}
			
			// 缓冲数组
			byte[] buf = new byte[1 << 10];
			// 记录读取到的字节数
			int len;
			// 开始复制
			while ((len = inputStream.read(buf)) != -1) {
				// 输入流读取数据到buf中，所有输出流将其输出
				for (OutputStream os: outputStreams) {
					os.write(buf, 0, len);
				}
			}
			// 输出运行结果
			System.out.println("复制完毕！");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭输入流
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			// 关闭所有输出流
			for (OutputStream os: outputStreams) {
				if (os != null) {
					try {
						os.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
```



## 8.转换流考核

现有一个gbk.txt文件，内容如下：

```tex
5.渚清沙白鸟飞回
3.诗圣 杜甫
1.唐诗300首
6.无边落木萧萧下
7.不尽长江滚滚来
2.登高
9.百年多病独登台
10.艰难苦恨繁霜鬓
4.风急天高猿啸哀
11.潦倒新停浊酒杯
8.万里悲秋常作客
```


要求使用gbk编码 逐行读取 上述文件，然后按照 1 2 3 ... 11次序排好并输出。

```java
提示1：缓冲流 转换流 文件流
提示2：Map<Integer,String>
			key:	7
			value:	7.不尽长江滚滚来
```



## 9.对象流考核

从键盘录入学生信息，格式为：姓名-学号-年龄，遇到quit结束录入

例如: 
	zs-001-21  
	ww-003-20
	tom-002-19
	quit

将每行数据转换成Student对象，然后添加到集合中，最后写入到文件src/dir/list.txt中。	


再编写一个程序，从src/dir/list.txt读取出所有学生的信息然后遍历输出。



## 10.数据流考核

编程实现：如果现在有一款只能试用10次的软件，超过10次之后就需要提醒用户购买正版软件。（程序运行一次，使用次数就要减一次）

> 提示：将试用的次数写到一个文件中，每次启动时对其进行读取并进行判断。

**答案及解析：**

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test028_UseCount {

	// 软件最大试用次数
	private final static int MAX_COUNT = 10;
	
	static {
		// 每次启动时检查使用次数
		checkCount();
	}

	private static void checkCount() {
		String filePath = "/Users/yuyan/Desktop/test/a.txt";
		File file = new File(filePath);
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			// 检查文件是否存在，如不存在则创建
			if (!file.exists()) {
				file.createNewFile();
			}
			// 初始化输入流和输出流
			br = new BufferedReader(new FileReader(file));
			// 读取一行内容
			String line = br.readLine();
			// 初始化输出流
			bw = new BufferedWriter(new FileWriter(file));
			if (line == null || "".equals(line.trim())) {
				// 文件为空则说明刚创建出来，写入本次产生的一次使用记录返回即可
				showCount(1);
				write(bw, 1);
				return;
			}
			// 转换为int类型
			int count = Integer.parseInt(line);
			// 判断是否超出使用次数，超出则提示并退出
			if (count >= MAX_COUNT) {
				print("试用次数已用完，请购买正版软件！");
				write(bw, count);
				exit();
			} 
			// 未超出则提示已经使用的次数，并写回文件中
			showCount(++count);
			write(bw, count);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	// 退出软件
	private static void exit() {
		System.exit(0);
	}
	
	// 输出使用次数到文件中
	private static void write(Writer writer, int count) {
		try {
			writer.write(String.valueOf(count));
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	// 显示剩余可用次数
	private static void showCount(int count) {
		print("您已试用" + count + "次，还剩" + (MAX_COUNT - count) + "次试用机会。");
	}
	
	// 输出信息方法
	private static void print(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		// 软件启动代码...
		print("欢迎使用xxxx软件系统！");
	}
}
```



## 11.对象流考核

编写两个方法，分别实现如下功能：

-   save()方法：创建三个Person类型对象，将它们使用序列化手段写入本地文件中持久化存储
-   load()方法：将save()方法中保存的Person对象读取出来，打印输出属性

```java
package com.briup.homework;

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

**答案及解析：**

**第一种实现方式，按顺序依次写入多个对象，并按顺序依次读取：**

```java
package com.briup.homework;

public class Test029_ObjectStream1 {
	
	private final static String FILE_PATH = "D:/test/obj_file";

	public static void save() {
		// 创建Person对象
		Person p1 = new Person("张三", "男");
		Person p2 = new Person("李四", "女");
		Person p3 = new Person("王五", "男");
		ObjectOutputStream oos = null;
		try {
			// 初始化对象输出流
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			// 写入对象
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void load() {
		ObjectInputStream ois = null;
		try {
			// 初始化对象输入流
			ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
			// 读取对象并输出
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
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

**第二种方式，将对象保存到集合中，写入和读取集合：**

```java
package com.briup.homework;

public class Test029_ObjectStream2 {
	
	private final static String FILE_PATH = "D:/test/obj_file";

	public static void save() {
		// 创建Person对象，保存到一个集合中
		List<Person> list = Arrays.asList(new Person("张三", "男"), new Person("李四", "女"), new Person("王五", "男"));
		ObjectOutputStream oos = null;
		try {
			// 初始化对象输出流
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			// 写入集合对象
			oos.writeObject(list);
			oos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void load() {
		ObjectInputStream ois = null;
		try {
			// 初始化对象输入流
			ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
			// 读取集合对象
			Object obj = ois.readObject();
			// 遍历集合并输出
			if (obj instanceof List) {
				List<?> list = (List<?>) obj;
				Iterator<?> iterator = list.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
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



## 12.转换流考核

编写程序，实现将一个文件从GBK编码转换为UTF-8编码。

```java
package com.briup.homework;

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

**答案及解析：**

```java
package com.briup.homework;

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
		// 创建临时文件对象，用于保存转换结果
		File temp = new File(dir, "temp");
		// 定义转换流对象
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		try {
			// 初始化输入流和输出流
			isr = new InputStreamReader(new FileInputStream(source), srcEncoding);
			osw = new OutputStreamWriter(new FileOutputStream(temp), distEncoding);
			// 缓冲数组
			char[] buf = new char[1 << 10];
			// 记录读取的字符数
			int len;
			// 开始复制
			while ((len = isr.read(buf)) != -1) {
				osw.write(buf, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (osw != null) {
				try {
					osw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
            // 复制结束后，删掉源文件，将临时文件改为源文件的名称
			source.delete();
			temp.renameTo(new File(dir, fileName));
		}
	}
}
```
