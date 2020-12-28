package com.briup.test;

public class StaticDemo {
	public static String name;
	
	
	public static void t1() {
		System.out.println("father");
	}
	public static void main(String[] args) {
	new StaticDemo().t1();
	new StaticDemo1().t1();
	}
}
class StaticDemo1 extends StaticDemo{
	public static void t1() {
		System.out.println("song");
	}
}