package com.briup.ch10;

@SuppressWarnings("all")
public class ThreadDemo8 {
	public static void main(String[] args) {

		class my implements Runnable {
			private int a;

			@Override
			public synchronized void run() {
				String name = Thread.currentThread().getName();
				for (; a < 10; a++) {
					System.out.println(name + ": a = " + a);
				}
				a = 0;
			}
		}
//		
//		Runnable r = new Runnable() {
//			private int a;
//
//			@Override
//			public void run() {
//				String name = Thread.currentThread().getName();
//				for (; a < 10; a++) {
//					System.out.println(name + ": a = " + a);
//				}
//
//			}
//		};
		Runnable r1 = new my();

		Thread t = new Thread(r1, "t线程");
		Thread y = new Thread(r1, "y线程");
		t.start();
		y.start();
	}
}