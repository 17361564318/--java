package com.briup.homework3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

//要求实现的功能：将1个文件的内容同时复制到多个文件
public class Copy {
	public Copy(String name, String fileName, String fileName1) throws Exception {
		FileInputStream in = new FileInputStream(name);
		OutputStream out1 = new FileOutputStream(fileName);
		OutputStream out2 = new FileOutputStream(fileName1);
		byte[] b = new byte[1024];
		while (-1 != in.read(b, 0, b.length)) {
			out1.write(b);
			out2.write(b);

		}
		out1.close();
		out2.close();

	}

	public static void main(String[] args) {
		String name = "src/com/briup/ch11/d.txt";
		String fileName1 = "src/com/briup/ch11/a.txt";
		String fileName2 = "src/com/briup/ch11/c.txt";
		try {
			Copy copy = new Copy(name, fileName1, fileName2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
