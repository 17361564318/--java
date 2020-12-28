package com.briup.ch07;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("java核心技术");
		list.add("java的变化与大同");
		list.add("45");

		for (String string : list) {
			// String string =(String)object;
			System.out.println(string.toUpperCase());
		}
	}
}
