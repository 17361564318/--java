package com.briup.ch11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo  {
	public static void main(String[] args) {
		OutputStream out = null;
		InputStream in = null;
			String name = "src/com/briup/ch11/a.txt";
			String name1 = "src/com/briup/ch11/e.txt";
			try {
			out = new FileOutputStream(name);
			in = new FileInputStream(name1);

			byte[] buf = {78,87,98};
			int len = -1;
			while ((len = in.read(buf)) != -1) {
				out.write(buf, 0, len);
				out.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 4.关闭流
			try {
				if (out != null)
					out.close();
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
