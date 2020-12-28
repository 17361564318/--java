package com.briup.ch07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("all")
public class ListDemo1 {
	public static void main(String[] args) {
		List list = null;
		list = new LinkedList();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("d");

		list.add(2, "x");// 插入
		list.set(2, "hello");// 替换
		System.out.println(list.indexOf("cc"));
		
		 LinkedList linkedList = (LinkedList)list;
		
		System.out.println(linkedList.getFirst());
		List newlist = list.subList(1, 3);
		System.out.println(newlist);
		System.out.println(newlist.getClass());
		Iterator iterator = list.iterator();
		// 通用方式
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println("--------------------");
		// list集合的专用方式
		for (int i = 0; i < list.size(); i++) {
			Object object = list.get(i);
			System.out.println(object);
		}
		System.out.println("--------------------");

		// JDK1.5以上
		for (Object object : list) {
			System.out.println(object);

		}
		System.out.println("--------------------");
		// JDK1.8以上
		list.forEach(obj -> System.out.println(obj));

	}

}
