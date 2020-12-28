package com.briup.ch11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriteDemo {
	public static void main(String[] args) {
		Writer out = null;
		BufferedWriter bw = null;
		try {
			String filepath = "src/com/briup/ch11/c.txt";
			out = new FileWriter(filepath);
			bw = new BufferedWriter(out);

			bw.write(123);
			bw.write("hello world ");
			bw.write("hello world ");
			bw.write("hello world ");
			bw.write("hello world ");
			bw.newLine();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.关闭流

			try {
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
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
