package com.briup.jdk8.lambda;

public interface Formula {

	public double calculate(int a);

	default double sqrt(int a) {
		return Math.sqrt(a);
	}

	public static void test() {
		System.out.println("hello test..");
	}
}

class FormulaTest {
	public static void main(String[] args) {

		Formula.test();

		Formula formula = new Formula() {

			@Override
			public double calculate(int a) {
				return a + 1;
			}
		};
		
		System.out.println(formula.calculate(1));
		System.out.println(formula.sqrt(9));
	}
}