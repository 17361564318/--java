package com.briup.ch11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class ObjectOutputStreamDemo implements Serializable{// 转换为字节序列，序列化
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		OutputStream os = null;
		try {
			String filepath = "src/com/briup/ch11/c.txt";
			os = new FileOutputStream(filepath);
			out = new ObjectOutputStream(os);
			Student s1 = new Student(1564);

			out.writeObject(s1);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.关闭流
			try {
				if (os != null)
					os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
