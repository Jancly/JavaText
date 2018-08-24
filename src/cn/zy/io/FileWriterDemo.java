package cn.zy.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		//演示FileWriter 用于操作文件的便捷类。
		FileWriter fw = new FileWriter("//home/deepin/a/a.txt");
		fw.write("你好谢谢再见");//这些文字都要先编码。都写入到了流的缓冲区中。
		fw.flush();
		fw.close();
	}

}
