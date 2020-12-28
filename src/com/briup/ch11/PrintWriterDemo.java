package com.briup.ch11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class PrintWriterDemo {
	public static void main(String[] args) {
		Writer out = null;
		PrintWriter pw = null;
		try {
			String filepath = "src/com/briup/ch11/c.txt";
			out = new FileWriter(filepath);
			pw = new PrintWriter(out);

			pw.println("heloo world");
			pw.println("heloo world");
			pw.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.关闭流
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (pw != null)
				pw.close();

		}
	}

}
