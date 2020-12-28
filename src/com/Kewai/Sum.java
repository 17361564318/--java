package com.Kewai;

import java.util.Scanner;

public class Sum {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int number = scanner.nextInt();
		System.out.println("请输入加几次");
		int count = scanner.nextInt();
		long sum = 0;
		String plusStr = "";
		for (int i = 0; i <= count; i++) {
			if (i == 1) {
				sum += number;
				plusStr += number + "+";
			} else {
				String str = "";
				for (int j = 1; j <= i; j++) {
					str += number;
				}
				sum += Long.parseLong(str);
				plusStr += str + "+";
			}
		}
		plusStr = plusStr.substring(0, plusStr.length() - 1);
		System.out.println(plusStr + "=" + sum);

	}

}
