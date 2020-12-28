package com.briup.homework3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 写俩个方法

第一个方法读取一个文件的前一半内容，第二方法读取文件的后一半内容
 */
public class Duqu {
	public static void main(String[] args) {
		new Duqu().t1();
		//new Duqu().t2();
	}

	public void t1() {// 读取前一半内容
		InputStream in = null;
		OutputStream out = null;
		String name = "src/com/briup/ch11/d.txt";
		try {
			in = new FileInputStream(name);
			out = new FileOutputStream("src/com/briup/ch11/c.txt", true);
			byte[] buf = new byte[10000];
			int len = -1;
			while ((len = (in.read(buf))) != -1) {
				out.write(buf, 0, len / 2);
				out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void t2() {// 读取后一半内容
		InputStream in = null;
		OutputStream out = null;
		String name = "src/com/briup/ch11/d.txt";
		try {
			in = new FileInputStream(name);
			out = new FileOutputStream("src/com/briup/ch11/c.txt", true);
			byte[] buf = new byte[10000];
			int len = -1;
			while ((len = (in.read(buf))) != -1) {
				out.write(buf, len / 2, len);
				out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
