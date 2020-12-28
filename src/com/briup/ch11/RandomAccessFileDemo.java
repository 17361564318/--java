package com.briup.ch11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {// 随机读写流
	public static void main(String[] args) {
		RandomAccessFile in = null;// 声明流
		RandomAccessFile out = null;
		try {
			in = new RandomAccessFile("src/com/briup/ch11/c.txt", "r");// 创建流
			out = new RandomAccessFile("src/com/briup/ch11/e.txt", "rw");

//			 in.seek(1056 + 7);// 定位到某个位置
			/*
			 * 使用流
			 */
			byte[] buf = new byte[1024];
			int data = -1;
			while ((data = in.read(buf)) != -1) {
				out.write(buf, 0, data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.关闭流

			try {
				if (in != null)
					in.close();
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
