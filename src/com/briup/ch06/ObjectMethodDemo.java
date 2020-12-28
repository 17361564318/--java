package com.briup.ch06;

public class ObjectMethodDemo {
	public static void main(String[] args) {
		Student s1 = new Student(21,1L,"ton");		
		Student s2 = new Student(21,1L,"ton");		
		System.out.println(s1.equals(s2));
		System.out.println(s1);
	}

}
