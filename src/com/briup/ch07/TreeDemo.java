package com.briup.ch07;

import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings("all")
public class TreeDemo {

//	使用TreeSet和Comparator
//	要求：对TreeSet中的元素1，2，3，4，5，6，7，8，9，10进行排列，排序逻辑为奇数在前偶数
//	在后，奇数按照升序排列，偶数按照降序排列
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 % 2 == 0 && o2 % 2 == 1) {
					return 1;
				}
				if (o1 % 2 == 1 && o2 % 2 == 0) {
					return -1;
				}
				if (o1 % 2 == 1 && o2 % 2 == 1) {
					return o1 - o2;
				}
				if (o1 % 2 == 0 && o2 % 2 == 0) {
					return o2 - o1;
				}
				return 0;
			}});
		set.add(8);
		set.add(9);
		set.add(4);
		set.add(7);
		set.add(2);
		set.add(3);
		set.add(6);
		set.add(1);
		set.add(10);
	//	System.out.println(set);
		for (Integer integer : set) {
			System.out.print(integer + "  ");

		}
	}
}


/*
 * class SetComparator implements Comparator<Integer> {
 * 
 * @Override public int compare(Integer o1, Integer o2) { if (o1 % 2 == 0 && o2
 * % 2 == 1) { return -1; } if (o1 % 2 == 1 && o2 % 2 == 0) { return 1; } if (o1
 * % 2 == 1 && o2 % 2 == 1) { return o1 - o2; } if (o1 % 2 == 0 && o2 % 2 == 0)
 * { return o2 - o1; } return 0; }
 * 
 * }
 */