package com.briup.homework3;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 
 * 有一个String s = "hello world *tom* how are you?";

读取这个字符串的内容并打印到a.txt
要求:
 *号不打印
 俩个星号中间的内容连续打印3遍
 */
public class PrintDemo {
	public static void main(String[] args) throws FileNotFoundException {
		OutputStream out = null;
		String name = "src/com/briup/ch11/a.txt";
		String s = "hello world *tom* how are you?";
		String[] split = s.split("[*]");
		String string = split[0] + split[1] + split[1] + split[1] + split[2];
		out = new FileOutputStream(name);
		byte[] buf = string.getBytes();
		try {
			out.write(buf);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
