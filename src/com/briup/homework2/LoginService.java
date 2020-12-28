package com.briup.homework2;

import java.util.HashMap;

public class LoginService {
	private static HashMap<String, String> map = new HashMap<>();
	static {
		map.put("李白", "123");
		map.put("兰陵王", "123");
		map.put("杨戬", "123");
		map.put("小短腿", "123");
		map.put("达摩", "123");
		map.put("马超", "123");
		map.put("关羽", "123");
		map.put("孙悟空", "123");
		map.put("不知火舞", "123");
		map.put("娜可露露", "123");
		map.put("孙尚香", "123");
	}

	// 验证用户名是否存在,以及密码是否匹配
	public boolean login(String name, String password) throws Exception {
		verify(name, password);
		if (map.containsKey(name)) {
			if (password.equals(map.get(name))) {
				new MainFrame();
				return true;
			} else {
				throw new Exception("用户名密码错误!");
			}
		} else {
			throw new Exception("用户名不存在!");
		}
	}

	public LoginService() {

	}

	// 验证用户名和密码是否为空
	public boolean verify(String name, String password) throws Exception {
		if ("".equals(name) || name == null) {
			throw new Exception("用户名不能为空!");
		} else if ("".equals(password) || password == null) {
			throw new Exception("密码不能为空!");
		} else {
			return true;
		}

	}

}
