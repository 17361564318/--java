package com.briup.ch10;

@SuppressWarnings("all")
public class ThreadDemo2 {
	public static void main(String[] args) {
		Thread t = new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		System.out.println(t.getState());

		t.start();
		System.out.println(t.getState());

		// 让main线程慢一点，等等t线程去执行
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getState());
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getState());
	}
	
}