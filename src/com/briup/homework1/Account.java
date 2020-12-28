package com.briup.homework1;

public class Account {
//	#balance:double			余额	
//
//	----------------------------------------------
//
//	+Account(double:balance)			
//
//	+getBalance():double
//
//	+deposit(double:amount):boolean	存钱，amount为存入金额，返回true
//
//	+withdraw(double:amount):boolean	取钱，amount为取出金额，如果amount>balance
//	返回false，amount<=balance返回true
	protected double balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(double balance) {
		// super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
//存钱
	public boolean deposit(double amount) throws Exception {
		if (amount>=0) {
			balance += amount;
			return true;
		}throw new Exception("请传入正数");
	
	}
//取钱
	public boolean withdraw(double amount) throws Exception {
		if (amount > balance&&amount>=0)
			throw new Exception("你没这么多钱");
			{balance = balance - amount;
				return true;
			}
	}
}
