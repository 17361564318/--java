package com.Kewai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maopao {

	public static void main(String[] args) throws Exception {
		int[] a = { 4, 6, 7, 0, 2, 65 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
