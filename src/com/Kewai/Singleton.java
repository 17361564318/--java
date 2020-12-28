package com.Kewai;

//饿汉式单例
public class Singleton {
	private Singleton() {

	}

	private static Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}

}
//懒汉式单例
class Singleton1 {
	private Singleton1() {
	}

	private static Singleton1 instance = null;

	public static synchronized Singleton1 getInstance() {
		if (instance == null) instance = new Singleton1();
			return instance;
	}

}
