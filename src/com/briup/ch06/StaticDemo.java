package com.briup.ch06;

import static java.lang.Math.PI;
import static java.lang.Math.random;
@SuppressWarnings("all")

public class StaticDemo {
	private static int a = 1;//静态属性，属于类，所有实例共享，例如饮水机,可以通过类名来访问
	private int b = 2;//非静态属性，属于对象所有，例如个人的水杯，在new对象成功之后，立马进行初始化，需要先创建对象，然后使用对象来访问。
	
	/*
	 * public static void test() { System.out.println(b); }
	 */
	/*
	 * public void test2() { System.out.println(a); }
	 */
	
		static {
			//静态代码块，对类中的静态属性做初始化,只会加载一次
			System.out.println("静态代码块");
			a=30;
		}	
		public StaticDemo() {
			
		}
	
	public static void main(String[] args) {
		
		/*
		 * StaticDemo t1 = new StaticDemo(); StaticDemo t2 = new StaticDemo();
		 * 
		 * t1.b = 10; t2.b = 20; System.out.println(t1.b); System.out.println(t2.b);
		 * 
		 * System.out.println("------------");
		 * 
		 * StaticDemo.a= 30;
		 * 
		 * // t1.a = 40; // t2.a = 50; System.out.println(StaticDemo.a);
		 * System.out.println(t1.a); System.out.println(t1.a);
		 */
		System.out.println(PI); 
		double d = random();
		System.out.println(d); 
	}
}
