package com.Kewai;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryTest {
	public int add(int a, int b) {
		try {
			return a + b;
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("fainally");
		}
		return 0;
	}

	public static void main(String[] args) throws Exception {

		TryTest test = new TryTest();
		System.out.println(test.add(3, 98));
		String str = null;
		if (str != null || str.length() == 0) {
			System.out.println("error");
		}
	}
}
