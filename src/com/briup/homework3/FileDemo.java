package com.briup.homework3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，在创建一个目
//录IOTest,之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下的文
//件
public class FileDemo {
	public static void main(String[] args) {
		// 声明流
		OutputStream out = null;
		try {
			// 创建流
			String name = "D:\\HelloWorld.txt";
			out = new FileOutputStream(name, true);
			// 使用流

			out.flush();
			File file = new File(name);
			System.out.println(file.isFile());
			File file2 = new File("D:\\IOTest");
			file2.mkdirs();
			File file3 = new File(file2.getAbsoluteFile() + "/" + file.getName());
			boolean renameTo = file.renameTo(file3);
			System.out.println("移动文件" + renameTo);
			String[] list = file2.list();
			for (String string : list) {
				System.out.println(string);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭流
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
