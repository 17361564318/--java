package com.briup.homework2;

import java.util.HashMap;

public class RegistService {
	private static HashMap<String, String> map = new HashMap<>();
		
	public RegistService() {
		
	}

	public boolean regist(String name, String password) throws Exception {
		verify(name, password);
		if (map.containsKey(name)) {
			throw new Exception("用戶名已经存在");
		} else {
			map.put(name, password);
			return true;
		}
	}

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
