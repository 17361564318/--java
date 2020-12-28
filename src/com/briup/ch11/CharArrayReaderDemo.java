package com.briup.ch11;

import java.io.CharArrayReader;
import java.io.Reader;

public class CharArrayReaderDemo {

	public static void main(String[] args) {
		Reader in = null;

		try {
			char[] buf = "你好".toCharArray();
			in = new CharArrayReader(buf);
//
//			int data = -1;
//			data = in.read();
//			System.out.println(in.ready());
//			System.out.println(data);
//			System.out.println(in.read());
//			System.out.println(in.read());
			
//			int data = -1;
//			while ((data = in.read()) != -1) {
//				System.out.println(in.read());
//			}
//			
//			char[] b = new char[5];
//			int len = in.read(b);
//			System.out.println(len+"   "+java.util.Arrays.toString(b));
			
			char[] b = new char[5];
			int len = in.read(b,2,3);
			System.out.println("len = "+len+"   "+java.util.Arrays.toString(b));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
