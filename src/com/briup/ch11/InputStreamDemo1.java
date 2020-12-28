package com.briup.ch11;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo1 {
	public static void main(String[] args) {
		// 1.声明流
		InputStream in = null;
		// 2.创建流
		in = System.in;
		// 3.使用流
		try {

//			int data = -1;
//			while ((data = in.read()) != -1) {
//				System.out.println(data);
//				}
//			byte[] buf = new byte[5];
//			int len = in.read(buf);
//			System.out.println(len);
//			System.out.println(java.util.Arrays.toString(buf));
//			byte[] buf = new byte[5];
//			int len = -1;
//			 bye命令后
//			byte[] bye = { 98, 121, 101, 13, 10 };
//
//			while ((len = in.read(buf)) != -1) {
//				if (java.util.Arrays.equals(buf, bye))
//					System.out.println("欢迎下次再来");
//				System.out.println("len : " + len + "\t" + java.util.Arrays.toString(buf));
//			}
			
//			byte[] buf = new byte[10];
//			int len = in.read(buf, 1, 3);
//			System.out.println("len : " + len + "\t" + java.util.Arrays.toString(buf));
			// System.out.println(in.markSupported());

			int data = -1;
			while ((data = in.read()) != -1) {
				if (data == 'e') {
					in.mark(1);
				
				} else if (data == 'o') {
					in.reset();
				}
//				if(data=='e') {
//					in.skip(2);
//				}
				System.out.println(data);
				System.out.println("in.available:"+in.available());
				Thread.sleep(1000);
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
		}
	}
}
