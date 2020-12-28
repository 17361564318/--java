package com.briup.ch06;

@SuppressWarnings("all")
public class Wrapper {

	public static void main(String[] args) {
//		int a = 1;
//		Integer i = new Integer(a);//int值变成对象	
//		int b = i.intValue();//对象变成int值

//		  Integer a = new Integer("1"); int i = a.intValue();
//		  
//		  int b = Integer.parseInt("1");//把字符串1转成int1
//		  
//		  String str = 1+"";

//		int a = Integer.parseInt("100100", 2);
//		System.out.println(a);
//		String string1 = Integer.toBinaryString(-1000);//二进制输出
//		String string = Integer.toBinaryString(1000);
//		System.out.println(string);
//		System.out.println(string1);
//		
		Integer a = 1000;
		Integer b = 1000;
		System.out.println(a==b);
		Integer x = 10;//自动装箱
		Integer y = 10;
		System.out.println(x==y);
		
		int q = new Integer(10);//自动拆箱
		System.out.println(q);;
	}

}
