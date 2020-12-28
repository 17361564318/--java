package com.Kewai.suanfa;

import java.util.Arrays;

public class ArrayIndex {
	static int[] a = new int[] { 1, 2, 3, 4, 6 };

	public static void test(int[] a) {
		int binarySearch = Arrays.binarySearch(a, 6);
		System.out.println(binarySearch);
	}

	public static void main(String[] args) throws Exception {
		ArrayIndex.test(a);
	}
}
