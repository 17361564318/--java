package com.briup.homework;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
	List<Integer> list = new ArrayList<Integer>();
	public void push() {
		for (int i = 0; i < 10; i++) {
			System.out.println("队列，他来了"+i);
			list.add(i);
		}
	}
	public void pop() {
		for (Object obj : list) {
			System.out.println("队列，她走了"+obj);
		}
	}
}
