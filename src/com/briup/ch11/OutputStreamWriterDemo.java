package com.briup.ch11;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class OutputStreamWriterDemo {
	public static void main(String[] args) {
		Writer out = null;
		OutputStream os = null;
		PrintWriter pw = null;
		try {
			String filepath = "src/com/briup/ch11/c.txt";
			os = new FileOutputStream(filepath);
			out = new OutputStreamWriter(os, "UTF-8");// 字节流转化为字符流，并可以设置编码
			pw = new PrintWriter(out);
			pw.println("heloo world");
			pw.println("你好");
			pw.println("NIGGER");
			pw.flush();

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
			try {
				if (pw != null)
					pw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
