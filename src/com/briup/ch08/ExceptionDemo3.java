package com.briup.ch08;

import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo3 {
	public static void main(String[] args)   {
	  ExceptionDemo3 demo3 = new	ExceptionDemo3();
	  demo3.test();
	  System.out.println("continus");
	}

	public void test() {
	try {
		Class.forName("");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}finally {
		System.out.println("continu");
		
	}
	}
	
	
}
