package com.briup.ch10;

@SuppressWarnings("all")
public class ThreadDemo1 {
	public static void main(String[] args) {
		// Thread任务：执行run方法中的代码
		Thread t = new Thread() {
			@Override
			public void run() {
				// 这里就是一个线程，需要执行的代码
				System.out.println(Thread.currentThread().getName() + ": hello world");
			}
		};
		t.start();// 启动线程
		System.out.println(Thread.currentThread().getName() + ":  hello world");// 获取当前执行代码的线程名字。
	}

}
