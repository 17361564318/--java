package com.briup.jdk8.lambda;

public class LambdaTest2 {
	public static void main(String[] args) {

	}

	@FunctionalInterface
	public interface Action {
		public void run();

		default void doSomething() {
			System.out.println("doSomething");
		}
	}

	public interface Work<T, V> {
		public V doWork(T t);
	}

	public static void test(Action a) {
		a.run();
		a.doSomething();
	}

	public static void run(Work<Integer, String> w) {
		String str = w.doWork(10);

	}
}
