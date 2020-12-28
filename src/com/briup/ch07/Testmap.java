package com.briup.ch07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Testmap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "张三丰");
		map.put(2, "周芷若");
		map.put(3, "阿牛哥");
		map.put(4, "灭绝师太");
		Set keySet = map.keySet();
		for (Object key : keySet) {
			Object value = map.get(key);
			System.out.println(key + "   " + value);

		}System.out.println("----------");
		map.put(5, "李晓红");
		for (Object key : keySet) {
			Object value = map.get(key);
			System.out.println(key + "   " + value);
		}
		System.out.println("----------");
		map.remove(1);
		for (Object key : keySet) {
			Object value = map.get(key);
			System.out.println(key + "   " + value);
		}System.out.println("----------");
		map.put(2, "赵敏");
		for (Object key : keySet) {
			Object value = map.get(key);
			System.out.println(key + "   " + value);
		}
	}
}