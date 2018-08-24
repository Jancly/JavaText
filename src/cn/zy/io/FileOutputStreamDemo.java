package cn.zy.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//需求： 将数据写入到文件中。
		//创建存储数据的文件。
		File file = new File("//home/deepin/aa/a.txt");
		//创建一个用于操作文件的字节输出流对象。 一创建就必须明确数据存储目的地。
		//输出流目的是文件， 会自动创建。 如果文件存在， 则覆盖。
		FileOutputStream fos = new FileOutputStream(file);
		//调用父类中的 write 方法。
		byte[] data = "abcde".getBytes();
		fos.write(data);
		//关闭流资源。
		fos.close();
		}
		}


