package com.briup.ch10;

import com.briup.homework.Test1;

public class ThreadDemo extends Thread {
	private Object obj1;
	private Object obj2;

	public ThreadDemo(Object obj1, Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void run() {
		String name = Thread.currentThread().getName();
		if ("Thread-0".equals(name)) {
			while (true) {
				synchronized (obj1) {
					synchronized (obj2) {
						System.out.println(name + " 运行了..");
						
					}
				}
			}
		} else {
			while (true) {
				synchronized (obj2) {
					synchronized (obj1) {
						System.out.println(name + " 运行了..");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Thread t1 = new ThreadDemo(obj1, obj2);
		Thread t2 = new ThreadDemo(obj1, obj2);
		t1.start();
		t2.start();
	}
}
