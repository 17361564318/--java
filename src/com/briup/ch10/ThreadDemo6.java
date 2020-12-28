package com.briup.ch10;

@SuppressWarnings("all")
public class ThreadDemo6 {
	//阻塞状态下，打断的话，抛出异常，终止阻塞
	public static void main(String[] args) throws InterruptedException {
		String name = Thread.currentThread().getName();
		Thread t = new Thread("t线程") {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				try {
					Thread.sleep(5000);
					System.out.println(name + " : 我自己醒了");
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println(name + ": 被打断");
				}

			}
		};
		Thread y = new Thread("y线程") {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				try {
					t.join();
					System.out.println(name + " : join既然结束");
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println(name + ": join被打断");
				}

			}
		};
		t.start();
		y.start();
		Thread.sleep(1);// 等待t线程运行到run方法
		System.out.println(name + ": t线程现在状态为" + t.getState());
		System.out.println(name + ": y线程现在状态为" + y.getState());
		System.out.println(name + "两秒后打断y线程");
//		Thread.sleep(2000);
//
		y.interrupt();// 打断t线程的阻塞状态

	}
}