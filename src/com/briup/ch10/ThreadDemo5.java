package com.briup.ch10;

@SuppressWarnings("all")
public class ThreadDemo5 {
	public static void main(String[] args) throws InterruptedException {
		String name = Thread.currentThread().getName();
		Thread t = new Thread("t线程") {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println(name + " : 我自己醒了");
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println(name + ": 被打断");
				}

			}
		};
		t.start();
		Thread.sleep(1);// 等待t线程运行到run方法
		System.out.println(name + ": t线程现在状态为" + t.getState());
		System.out.println(name + "两秒后打断t线程");
		Thread.sleep(2000);

		t.interrupt();// 打断t线程的阻塞状态
		// System.out.println(name + ": t线程现在状态为" + t.getState());

	}
}