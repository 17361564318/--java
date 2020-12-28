package com.briup.homework2;

public class ThreadTest {
//	线程对象有一个final方法:
//		public final void setPriority(int newPriority)
//		可以用来设置线程的优先级（最大优先级是10 最小是1 默认是5）
//
//		设计一个实验，来测试优先级对线程的执行带来的影响，同时得出你的结论
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
 				System.out.println("哈哈，我是线程t1");
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("哈哈，我是线程t2");
			}
		};
		t1.setPriority(2);
		t2.setPriority(5);
		t1.start();
		t2.start();
	}
}
