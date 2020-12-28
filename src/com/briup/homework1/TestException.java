package com.briup.homework1;

import java.util.Scanner;

import sun.nio.cs.ext.ISCII91;

public class TestException {
	// 在命令行输入参数不能满足输出要求时，会抛出相应异常，
	// 使用异常处理机制处理抛出的异常。
	public static void main(String[] args) {
		TestException exception = new TestException();
		try {
			if (args.length < 3)throw new Exception("请输入三个以上的字符");
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	}

