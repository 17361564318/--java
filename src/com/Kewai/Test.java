package com.Kewai;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test {
	public static String a = "hello";
	public static void main(String[] args) throws Exception {
		
		a = "he";
		Test.a="hrl";
		System.out.println(a);
		
//		ServerSocket ser = new ServerSocket(8888);
//		System.out.println("start");
//		while (true) {
//			Socket accept = ser.accept();
//			OutputStream outputStream = accept.getOutputStream();
//			outputStream.write("http/1.1 200 OK\r\n".getBytes());
//			outputStream.write("\r\n".getBytes());
//			String a = "<a href='http://www.baidu.com'>点击</a>";
//
//			outputStream.write(a.getBytes());
//
//			outputStream.write("hello world".getBytes());
//			outputStream.flush();
//			outputStream.close();
//		}
//	}
//	
		
		//String s1 = "String";
//		String s2 = new String("String");
//		String s3 = "Str" + "ing";
//		System.out.println(s1 == s2);//false
//		System.out.println(s1 == s3);//true
//		System.out.println(s1==s1.intern());//true
		
//		String aString = "null";
//		if(aString==null) {
//			System.out.println("a");
//		}else if (aString.length()==0) {
//			System.out.println("b");
//		}else {
//			System.out.println("c");
//		}
		
		
		System.out.println(tes(5));
		
	}
	
	public static int tes(int a) {
			
		if (a==0) {
			return 1;
		}else{
			return a*tes(a-1);
		}
		
	}
}
