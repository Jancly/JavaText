package cn.zy.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("//home/deepin/aa/a.txt");
		//创建一个字节输入流对象,必须明确数据源， 其实就是创建字节读取流和数据源相关联。
		FileInputStream fis = new FileInputStream(file);
		//读取数据。 使用 read();一次读一个字节。
		int ch = 0;
		while((ch=fis.read())!=-1){
		System.out.println("ch="+(char)ch);
		}
		// 关闭资源。
		fis.close();
		
	}

}
