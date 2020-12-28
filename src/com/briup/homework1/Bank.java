package com.briup.homework1;

import java.util.ArrayList;
import java.util.List;

public class Bank {
//	----------------------------------------------
//
//	-customers:List<Customer>		客户
//
//	-custNum:int			客户数量
//
//	----------------------------------------------
//
//	+Bank()
//
//	+addCustomer(Customer:customer):void
//
//	+getCustomer(int:index):Customer	获取指定位置的客户
//
//	+getCustomerNum():int
	private List<Customer> customers = new ArrayList<Customer>();
	private int custNum ;

	public void Bank() {

	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
		custNum++;
	}

	public Customer getCustomer(int index) {

		return customers.get(index);

	}

	public int getCustomerNum() {
		return custNum;

	}
}
