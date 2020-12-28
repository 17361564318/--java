package com.briup.jdk8.lambda;

public class LambdaTest4 {
	public static void main(String[] args) {
		Model m = new Model();
		// 使用lambda实现接口中的抽象方法
		Action<Model> action = null;
		action = t -> t.test1();
		action = t -> t.test2("");
		action = t -> t.test3();

		// 使用类名::非静态方法
		action = Model::test1;
		action.run(m);

	}

	@FunctionalInterface
	public interface Action<T> {
		public void run(T t);
	}

	public static class Model {
		public void test1() {
			System.out.println("test1");
		}

		public void test2(String s) {
			System.out.println("test2");
		}

		public int test3() {
			System.out.println("test3");
			return 0;
		}
	}
}
