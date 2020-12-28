package com.briup.ch08;

import com.briup.ch07.Gender;
import com.briup.ch07.Student;

import javafx.scene.AccessibleAction;

@SuppressWarnings("all")
public class ReflectionDemo2 {
	public static void main(String[] args) {
		Class<?> c = null;
		c = int.class;
		System.out.println(c.isPrimitive());// true是否是基本类型
		System.out.println(c.getName());// int返回c的名字
		System.out.println("---------------");
		c = Student.class;
		System.out.println(c.isPrimitive());
		System.out.println(c.isInterface());
		System.out.println(c.isArray());
		System.out.println(c);
		System.out.println("---------------");
		c = Action.class;
		System.out.println(c.isInterface());
		System.out.println(c);
		System.out.println("---------------");
		c = int[].class;
		System.out.println(c.isArray());
		System.out.println(c);
		System.out.println(c.getComponentType());
		System.out.println("---------------");
		c = Gender.class;
		System.out.println(c.isEnum());
		System.out.println(c);
		System.out.println("---------------");

		c = java.lang.SuppressWarnings.class;
		System.out.println(c.isAnnotation());
	}

}

interface Action {
}