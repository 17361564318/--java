package com.briup.homework2;

public class Test {
	public static void main(String[] args) {

		Timer timer = new Timer(10, new ActionListener() {

			@Override
			public void actionPerformed() {
				System.out.println("hello");
			}
		});
		timer.start();
	}
}
