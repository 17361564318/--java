package com.briup.ch10;

@SuppressWarnings("all")
public class ThreadDemo4 {
	public static void main(String[] args) {
		Thread t = new Thread("thread1");
		System.out.println(t.getId());

		System.out.println(t.getName());
		t.setPriority(1);
		System.out.println(t.getPriority());

		t.start();
		System.out.println(t.getState());
		System.out.println(t.isAlive());

	}
}