package com.Kewai;

public class CharacterChange {

	public static void main(String[] args) throws Exception {
		String string = "hello";

		String string1 = new String(string.getBytes("UTF-8"), "GBK");
	}
}
