package com.briup.test;

import java.util.Scanner;

public class NumberTest {
	public static void main(String[] args) throws Exception {
		Scanner sc1 = new Scanner(System.in);
		int t = sc1.nextInt();// 测试用例的组数
		int c = t * 2;
		for (int i = 0; i < c; i++) {
			Scanner sc2 = new Scanner(System.in);// 字符串的长度
			int n = sc2.nextInt();
			Scanner sc3 = new Scanner(System.in);// 输入的字符串
			String str = sc3.next();
			int length = str.length();
			c--;

			if (length == 11 && "8".equals(str.substring(0, 2))) {
				System.out.println("NO");
			}
			System.out.println("YES");

		}

	}

}
