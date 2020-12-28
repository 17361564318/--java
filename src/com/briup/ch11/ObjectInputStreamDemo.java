package com.briup.ch11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectInputStreamDemo {// 字节序列恢复为Java对象，反序列化
	public static void main(String[] args) {
		ObjectInputStream in = null;
		InputStream is = null;
		try {
			String filepath = "src/com/briup/ch11/c.txt";
			is = new FileInputStream(filepath);
			in = new ObjectInputStream(is);
			Object obj = in.readObject();
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.关闭流
			try {
				if (is != null)
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
