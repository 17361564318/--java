package com.briup.ch07;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();// 前后数据类型保持一致,不能是子父类关系
		// List<?>是所有List<>的父类
		List<Object> list2 = new ArrayList<Object>();
		test(list2);
		test(list);
	}

	public static void test(List<?> list) {
		list.add(null);
		for(Object o:list){
			System.out.println(o);
		}
	}

}
