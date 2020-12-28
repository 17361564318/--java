package com.briup.ch10;

@SuppressWarnings("all")
public class ThreadDemo9 {
	private static int a;

	public static void main(String[] args) {
		ThreadDemo9 td = new ThreadDemo9();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				td.test();
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				td.test1();
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t2.start();
	}

	// 对谁加锁？ 这个test（）的代码块
	// 使用哪一个对象来充当这把锁？默认为this
	public synchronized void test() {
		String name = Thread.currentThread().getName();
		for (; a < 10; a++) {
			System.out.println(name + ": a = " + a);
		}
		a = 0;

	}
	public synchronized void test1() {
		String name = Thread.currentThread().getName();
		for (; a < 10; a++) {
			System.out.println(name + ": a = " + a);
		}
		a = 0;
		
	}

	// 对谁加锁？ 这个hello（）的代码块
	// 使用哪一个对象来充当这把锁？当前类的Class对象
	public synchronized static void hello() {
	}
}