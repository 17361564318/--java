package com.briup.ch11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class InputStreamndOutputDemo {
	public static void main(String[] args) {
		// 1.声明流
		InputStream in = null;
		OutputStream out = null;
		// 2.创建流m
		in = System.in;
		out = System.out;
		// 3.使用流
		try {
			byte[] buf = new byte[10];
			int len = -1;
			while ((len = in.read(buf)) != -1) {
				System.out.println(Arrays.toString(buf));
				out.write(buf, 0, len);
				out.flush();
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
