package com.briup.ch11;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReadrDemo {
	public static void main(String[] args) {
		Reader in = null;
		try {
			String filepath = "src/com/briup/ch11/c.txt";
			in = new FileReader(filepath);

			char[] buf = new char[1024];
			int len = -1;
			int num = 0;
			while ((len = in.read(buf)) != -1) {
				num += len;
				System.out.print(new String(buf, 0, len));
			}
			System.out.println("num = " + num);
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
		}
	}
}
