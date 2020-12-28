package com.briup.ch10;

@SuppressWarnings("all")
public class ThreadDemo3 {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);

		Thread t = new Thread("线程一");
		System.out.println(t);

		ThreadGroup group = thread.getThreadGroup();
		ThreadGroup group2 = t.getThreadGroup();
		
		System.out.println(group.activeCount()+group2.activeCount());
		
		System.out.println(group == group2);//是同一個线程组
	}

}