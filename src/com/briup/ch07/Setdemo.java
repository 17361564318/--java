package com.briup.ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings("all")
public class Setdemo {
	public static void main(String[] args) {
		Set set = null;

		set = new HashSet();

		set.add("hello1");
		set.add("hello2");
		set.add("hello3");
		set.add("hello4");
		set.add("hello5");
		set.add("hello6");
		set.add("hello6");//无序不可重复

		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		System.out.println("-------------");
		for (Object object : set) {
			System.out.println(object);
		}System.out.println("-------------");

		set.forEach(obj -> System.out.println(obj));
	}
}
