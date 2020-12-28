package com.briup.count;

public class Account {
	private int balance;

	public Account(int balnace) {
		this.balance = balnace;
	}

	// 存钱
	public synchronized void pos(int money) {
		String name = Thread.currentThread().getName();
		balance += money;
		System.out.println(name + "存钱" + money + "元,余额" + balance);
		this.notifyAll();
	}

	// 消费
	public synchronized void wit(int money) {
		String name = Thread.currentThread().getName();
		while (money > balance) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
		System.out.println(name + "消费" + money + "元,余额" + balance);
	}
}
