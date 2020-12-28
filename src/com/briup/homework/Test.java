package com.briup.homework;

import sun.misc.UCDecoder;

public class Test {
//	（4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算
	
	public static void main(String[] args) {
		/*
		 * UseCompute uc = new UseCompute(); Add add = new Add(); Sub sub = new Sub();
		 * Mul mul = new Mul(); Div div = new Div(); uc.useCom(add, 4, 1);
		 * uc.useCom(sub, 1, 1); uc.useCom(mul, 1, 1); uc.useCom(div, 1, 1);
		 */
		UseCompute.useCom(new Add(), 15, 21);
		UseCompute.useCom(new Sub(), 15, 21);
		UseCompute.useCom(new Mul(), 15, 21);
		UseCompute.useCom(new Div(), 15, 21);
	}
}
