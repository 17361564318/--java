package com.briup.ch08;

import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo5 {
	public static void main(String[] args) throws PassWordException {
		ExceptionDemo5 demo5 = new ExceptionDemo5();
		demo5.test();
	}

	public void test() throws PassWordException {
		String password1 = "123";
		String password2 = "1234";
		if (!password1.equals(password2)) {
			throw new PassWordException("密码不正确");
		}
	}
}
