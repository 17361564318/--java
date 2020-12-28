package com.briup.homework;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	List<Integer> list = new ArrayList<Integer>();

	void push() {
		for (int i = 0; i < 10; i++) {
			list.add(i);
			System.out.println("栈" + i);
		}
	}

	void pop() {
		for (int i = list.size() - 1; i >= 0; i--) {
			list.get(i);
			System.out.println("栈，她走了" + i);
		}
	}

}
