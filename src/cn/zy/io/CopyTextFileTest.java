package cn.zy.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFileTest {
	public static void main(String[] args) throws IOException {
		copyTextFile();
	}
	public static void copyTextFile() throws IOException {
		//1,明确源和目的。
		FileReader fr = new FileReader("//home/deepin/a/a.txt");
		FileWriter fw = new FileWriter("//home/deepin/a/a.txt");
		//2,为了提高效率。自定义缓冲区数组。字符数组。
		char[] buf = new char[1024];
		int len = 0;
		while((len=fr.read(buf))!=-1){
			fw.write(buf,0,len);
			System.out.println(fr);
		}
		/*2,循环读写操作。效率低。
		int ch = 0;
		while((ch=fr.read())!=-1){
			fw.write(ch);
		}
		*/
		//3,关闭资源。
		fw.close();
		fr.close();
	}

}
