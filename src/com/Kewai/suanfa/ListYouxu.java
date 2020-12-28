package com.Kewai.suanfa;

import java.util.ArrayList;
import java.util.List;

public class ListYouxu {
	public static void main(String[] args) throws Exception {
		ListYouxu.save(0);
	}

	public static void save(int n) {
		List<Integer> list = new ArrayList<Integer>();

		boolean flag = false;
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(6);
		for (int i = 0; i < list.size(); i++) {
			if (n < list.get(i)) {
				list.add(i, n);
				flag = true;
				break;
			}
		}
		if (!flag) {
			list.add(n);
		}
		System.out.println(list);
	}

}
