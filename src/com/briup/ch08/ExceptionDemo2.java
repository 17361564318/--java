package com.briup.ch08;

import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo2 {
	public static void main(String[] args) throws Exception {
		System.out.println("main方法开始执行");
		ExceptionDemo2 demo1 = new ExceptionDemo2();
		demo1.test1();
		System.out.println("main方法执行结束");
	}

	public void test1() {
		test2();
	}

	public void test2() {
		test3();
	}

	public void test3() {
		test4();
	}

	public void test4() {
			test5();
	}

	public void test5() {
		try {
			int a = 2 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
