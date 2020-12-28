package com.Kewai;

public class Reverse {
	public static String reverse(String string) {
		if (string == null || string.length() <= 1)
			return string;
		return reverse(string.substring(1)) + string.charAt(0);
	}

	public static void main(String[] args) throws Exception {
		String string = "hello";
		String reverse = Reverse.reverse(string);
		System.out.println(reverse);
	}
}
