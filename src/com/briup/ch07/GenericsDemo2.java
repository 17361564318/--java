package com.briup.ch07;

public class GenericsDemo2 {
	public static void main(String[] args) {
		Point<Integer> point = new Point<Integer>(1, 2);
		Point<Double> point1 = new Point<Double>(1D, 2D);
		Point<Long> point2 = new Point<Long>(1L, 2L);

		System.out.println(point.toString());
		System.out.println(point1);
		System.out.println(point2);

		Action<String> a = new Action<String>() {

			@Override
			public void test(String t) {

			}

			@Override
			public <S> S run(S s) {
				return null;
			}

		};
		a.run(1);
	}
}

interface Action<T> {
	public void test(T t);

	public <S> S run(S s);

}