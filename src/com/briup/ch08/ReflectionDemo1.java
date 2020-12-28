package com.briup.ch08;

import com.briup.ch07.Gender;
import com.briup.ch07.Student;

import javafx.scene.AccessibleAction;

@SuppressWarnings("all")
public class ReflectionDemo1 {
	public static void main(String[] args) throws Exception {
		Class<?> class1 = Student.class;

		Student student = new Student();
		Class<?> class2 = student.getClass();

		// String className = "com.briup.ch07.Student";
		Class<?> class3 = Class.forName("com.briup.ch07.Student");

		System.out.println(class1 == class2);
		System.out.println(class3 == class2);

		Class class4 = Class.forName("com.briup.ch07.Student");
		Object obj = class4.newInstance();
		System.out.println(obj);
		// return obj;
	}
}