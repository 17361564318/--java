package com.briup.homework;

public class Add implements Compute {

	@Override
	public int computer(int n, int m) {
		int a ;
		a = n+m;
		System.out.println(a);
		return n + m;
	}

}
