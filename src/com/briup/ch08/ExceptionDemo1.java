package com.briup.ch08;

import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo1 {
	public static void main(String[] args) throws Exception {
		// int a = 1 / 0;
		// String string = null;
		// System.out.println(string.length());
//		int[] a = new int[5];
//		System.out.println(a[5]);

//		Class.forName("abc.abc");

//		Object object = new Object();
//		String string = (String)object;

//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		
//		for (int a : list) {
//			System.out.println(a);
//			list.add(3);
//		}
		ExceptionDemo1 demo1 = new ExceptionDemo1();
		System.out.println(demo1.f(100));
	}

	public int f(int x) {
		if (x == 1)
			return 1;

		return x + f(x - 1);
	}

}
