package com.briup.ch11;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class OutputStreamDemo {
	public static void main(String[] args) {
		OutputStream out = null;
		try {
			out = System.out;

//			byte[] b = { 54, 98, 98 };
//			// byte[] <===>String
//			b = "你好".getBytes();
//			String str = new String(b);
//			System.out.println(Arrays.toString(b));
//			out.write(b);

			byte[] b = { 97, 98, 99, 100, 101 };
			out.write(b, 0, 3);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
