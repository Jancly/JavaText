package cn.zy.io;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
	public static void main(String[] args) throws IOException {
		//给文件中写中文
		writeCNText();
		//读取文件中的中文
		readCNText();
	}	
	//读取中文
	public static void readCNText() throws IOException {
		FileReader fr = new FileReader("//home/deepin/a/a.txt");
		int ch = 0;
		while((ch = fr.read())!=-1){
			//输出的字符对应的编码值
			//System.out.print(ch);
			//输出字符本身
			System.out.print((char)ch);
		}
	}
	//写中文
	public static void writeCNText() throws IOException {
		FileOutputStream fos = new FileOutputStream("//home/deepin/a/a.txt");
		fos.write("a传智播客欢迎你".getBytes());
		fos.close();
	}

}
