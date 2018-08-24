package cn.zy.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharStreamDemo {
	public static void main(String[] args) throws IOException {
		//给文件中写中文
		writeCNText();
		//读取文件中的中文
		readCNText();
	}	
	//读取中文
	public static void readCNText() throws IOException {
		FileInputStream fis = new FileInputStream("//home/deepin/a/b.txt");
		int ch = 0;
		while((ch = fis.read())!=-1){
			System.out.println(ch);
		}
	}
	//写中文
	public static void writeCNText() throws IOException {
		FileOutputStream fos = new FileOutputStream("//home/deepin/a/b.txt");
		fos.write("a传智播客欢迎你".getBytes());
		fos.close();
	}

}
