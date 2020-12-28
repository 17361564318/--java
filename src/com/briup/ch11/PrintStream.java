package com.briup.ch11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class PrintStream {
	public static void main(String[] args) {

		OutputStream out = null;
		java.io.PrintStream ps = null;
		
		try {
		String name = "src/com/briup/ch11/c.txt";
			out = new FileOutputStream(name);
			ps = new java.io.PrintStream(out);
//			String str = "hello world";
//			byte[] b = str.getBytes();
//			out.write(b);
//			out.flush();
			ps.println("hello world");
			ps.println(new Object());
			ps.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
