package com.briup.test;

import java.util.Scanner;

public class Regist {

	public static void main(String[] args) throws Exception {
		Scanner nam = new Scanner(System.in);
		String name = nam.next();
		Scanner password = new Scanner(System.in);
		String psword = password.next();
		Scanner phone = new Scanner(System.in);
		String pho = phone.next();
		if (name.equals("zhangsan") || name.equals("lisi")) {
			System.out.println("用户名已存在");
		} else if (psword.length() > 16 || psword.length() < 8) {
			System.out.println("密码格式错误");
		} else if (pho.length() != 11 || pho.substring(0, 1) != String.valueOf(1)) {
			System.out.println("请输入正确的手机号");
		} else {
			System.out.println("注册成功！！");
		}

	}

}
