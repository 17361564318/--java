package com.briup.ch11;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterDemo {
	public static void main(String[] args) {
		Writer out = null;
		try {
			String filepath = "src/com/briup/ch11/c.txt";
			out = new FileWriter(filepath,true);

			out.write("hello\r\n");
			out.write("hello\r\n");
			out.write("hello\r\n");
			out.write("hello\r\n");
			out.write("fuck\r\n");
			
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.关闭流
			try {
				if (out != null)
					out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
