package com.briup.ch11;

import java.io.IOException;
import java.io.InputStream;

public class ByteArrayInputStream {
	public static void main(String[] args) {
		InputStream in = null;
		try {
			byte[] buf = "hello".getBytes();
			in = new java.io.ByteArrayInputStream(buf);
			
			int data = -1;
			while((data=in.read())!=-1) {
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
