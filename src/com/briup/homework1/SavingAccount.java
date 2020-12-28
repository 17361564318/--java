package com.briup.homework1;

public class SavingAccount extends Account {

//SavingAccount(extends Account)
//
//----------------------------------------------
//
//-rate:double			利率		
//
//----------------------------------------------

//+SavingAccount(double:balance, double rate)
	private double rate;

	public SavingAccount() {
	}

	public SavingAccount(double balance) {
		super(balance);
	}

	public SavingAccount(double balance, double rate) {
		this.rate = rate;
		//super.balance = balance + balance * (rate / 100);
		this.balance = balance;
	}

}
