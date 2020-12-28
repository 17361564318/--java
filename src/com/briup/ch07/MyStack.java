package com.briup.ch07;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("all")
public class MyStack {

	public static void main(String[] args) {
		List list =new ArrayList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.add(3, "f");
		System.out.println(list);
	}
}
