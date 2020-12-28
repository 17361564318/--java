package com.briup.ch07;

import java.util.List;

public enum Gender implements EnumAction<List<?>> {
	M("nan") {

		@Override
		public void go() {
			System.out.println("打篮球");
		}

		@Override
		public void doSometing(List<?> t) {
			for (Object object : t) {
				System.out.println(object);
			}

		}

	},
	F("nv") {

		@Override
		public void go() {
			System.out.println("逛街");
		}

		@Override
		public void doSometing(List<?> t) {
			for (Object object : t) {
				System.out.println(object);
			}
		}

	};
	String name;
	static String msgString = "hello";

	public void test() {

	}

	public static void run() {

	}

	private Gender() {
		System.out.println("wucangouzaoqi");
	}

	private Gender(String name) {
		this.name = name;
		System.out.println("youcangouzaoqi");
	}

	{
		System.out.println("nimingdaimakuai");
	}
	static {
		System.out.println("jintaidaimakuai");
	}

	public abstract void go();
}

interface EnumAction<T> {
	void doSometing(T t);
}
