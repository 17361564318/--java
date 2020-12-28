package com.briup.ch10;

import com.sun.org.apache.bcel.internal.generic.NEW;

@SuppressWarnings("all")
public class ThreadDemo10 {
	private static int a;

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo10 td = new ThreadDemo10();
		Thread t1 = new Thread("t1线程") {
			@Override
			public void run() {
				td.test();
			}
		};
		Thread t2 = new Thread("t2线程") {
			@Override
			public void run() {
				td.test();
			}
		};
		t1.start();
		t2.start();
		System.out.println("main t1状态" + t1.getState());
		System.out.println("main t2状态" + t2.getState());
		Thread.sleep(7000);

		synchronized (o) {
			o.notifyAll();
		}
		Thread.sleep(15000);
		if(t1.isAlive()) {
			System.out.println("main :发现t1还活着，尝试打断. "+"状态为"+t1.getState());
			t1.interrupt();
		}
		if(t2.isAlive()) {
			System.out.println("main :发现t2还活着，尝试打断. "+"状态为"+t2.getState());
			t2.interrupt();
		}

	}

	// 对谁加锁？ 这个test（）的代码块
	// 使用哪一个对象来充当这把锁？默认为this
	static Object o = new Object();

	public void test() {
		String name = Thread.currentThread().getName();
		synchronized (o) {
			for (; a < 10; a++) {
				System.out.println(name + ": a = " + a);
				try {
					if (a == 5) {
						o.wait();
					}
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			a = 0;
		}

	}

	// 对谁加锁？ 这个hello（）的代码块
	// 使用哪一个对象来充当这把锁？当前类的Class对象
	public synchronized static void hello() {
	}
}