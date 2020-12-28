package com.briup.homework1;

public class Customer {
//	----------------------------------------------
//
//	-account:Account			账户
//
//	-name:String			姓名
//
//	----------------------------------------------
//
//	+Customer(String:name)
//
//	+getAccount():Account		
//
//	+setAccount(Account:account):void
//
//	+getName():String
	private Account account;
	private String name;

	public Customer() {
	}
	public Customer(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
