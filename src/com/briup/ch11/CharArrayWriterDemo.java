package com.briup.ch11;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;


public class CharArrayWriterDemo {
	public static void main(String[] args) {
		Writer out = null;

		try {
			out = new CharArrayWriter();
			out.write(97);
			out.write(26465);
			out.write(20000);
			out.write(new char[] {'a',98,'c'});
			out.write(new char[] {'a',98,'c'},1,2);
		char[] b = 	((CharArrayWriter)out).toCharArray();
		System.out.println(java.util.Arrays.toString(b));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
