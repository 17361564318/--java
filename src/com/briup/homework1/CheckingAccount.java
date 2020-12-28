package com.briup.homework1;

public class CheckingAccount extends Account {

	// CheckingAccount(extends Account)
//
//	----------------------------------------------
//
//	-overdraft:double			透支额度
//
//	----------------------------------------------
//
//	+CheckingAccount(double:balance, double overdraft)
//
//	+CheckingAccount(double:balance)	设置透支额度为0
//
//	+withdraw(double:amount):boolean	取钱amount为取出金额，如果amount>balance+overdraft返回false，amount<=balance+overdraft返回true
//
//	+getOverdraft():double
	private double overdraft;

	public CheckingAccount(double balance) {
		// super(balance);
		this.balance = balance;
		overdraft = 0;

	}

	public CheckingAccount(double balance, double overdraft) {
		// super(balance);
		this.balance = balance;
		this.overdraft = overdraft;
	}

	public boolean withdraw(double amount) throws Exception {
		if (amount > balance + overdraft)
			throw new Exception("你的钱不能取");
		{
			if (amount > balance) {
				overdraft = balance + overdraft - amount;
				balance = 0;
			}
			balance = balance - amount;
			return true;
		}
	}

	public double getOverdraft() {
		return overdraft;
	}

}
