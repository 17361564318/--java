package com.briup.ch08;

public class AssertDemo {

	public static void main(String[] args) {
		int a = -1;
		AssertDemo demo = new AssertDemo();
		demo.test(a);
	}

	public void test(int a) {

		assert a > 0 : "项目一期，a必须大于0";

		System.out.println("a= " + a);
	}

}
