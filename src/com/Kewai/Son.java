package com.Kewai;

//public class Teacher extends Person {
//	private String name = "tom";
//
//	public Teacher() {
//		super();
//		System.out.println("this is a teacher");
//	}
//
//	public static void main(String[] args) throws Exception {
//		Teacher t = new Teacher();
//		System.out.println(t.name);
//	}
//
//}
//
//class Person {
//	public Person() {
//		System.out.println("this is person");
//	}
//}
class Father{
	private String name = "father";

	public String getName() {
		return name;
	}
	
}
public class Son extends Father{
	private String name = "son";
	public static void main(String[] args) throws Exception {
		Son son = new Son();
		try {
			System.out.println(son.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		}
	}
}

