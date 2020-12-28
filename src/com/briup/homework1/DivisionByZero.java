package com.briup.homework1;

import org.ietf.jgss.Oid;

public class DivisionByZero {
//	1. division()：要求执行10/0操作，并使用异常处理机制处理产生的异常
//	2. main()：调用division()
//	3. 修改division()：执行10/0不变，但不在方法中处理产生的异常，改将异常抛出
//	4. 修改main()：调用division()并处理其抛出的异常
//	public static void main(String[] args) throws Exception {
//		DivisionByZero zero = new DivisionByZero();
//		zero.division();
//	}
//	
	public static void main(String[] args) {
		DivisionByZero zero = new DivisionByZero();
		try {
			zero.division();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
//	public void division() {
//		try {
//			int a = 10 / 0;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	public void division()throws RuntimeException {
		int a = 10/0;
	}
	
}