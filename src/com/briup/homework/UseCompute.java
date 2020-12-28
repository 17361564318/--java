package com.briup.homework;

public class UseCompute {
//	（3）设计一个类UseCompute，类中含有方法：public void useCom(Compute com, int one, int two)，
//	此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。 
	
	public static void useCom(Compute com, int one, int two) {
//		Add add = new Add();
//		System.out.println(add.computer(one, two));
//		Sub sub = new Sub();
//		System.out.println(sub.computer(one, two));
//		Mul mul = new Mul();
//		System.out.println(mul.computer(one, two));
//		Div div = new Div();
//		System.out.println(div.computer(one, two));
	com.computer(one, two);
	}

}
