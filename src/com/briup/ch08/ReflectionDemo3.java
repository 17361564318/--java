package com.briup.ch08;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import com.briup.ch07.Student;

@SuppressWarnings("all")
public class ReflectionDemo3 {
	public static void main(String[] args) throws Exception {
		Student student = new Student();
		Class<?> c = student.getClass();

		System.out.println(c.getPackage().getName());
		System.out.println(c.getModifiers());
		System.out.println(Modifier.PUBLIC);
		System.out.println(Modifier.STATIC);

		System.out.println(c.getName());
		Class supClass = c.getSuperclass();
		System.out.println(supClass);
		System.out.println(supClass.isAssignableFrom(c));
		
		Class<?>[] interfaces = c.getInterfaces();
		System.out.println(Arrays.toString(interfaces));
		
		Field[] fields = c.getDeclaredFields();
		for(Field f:fields) {
			System.out.println(f.getName());
			System.out.println(f.getType());
		}
		System.out.println("------------");
		Constructor<?>[] constructors = c.getDeclaredConstructors();
		for(Constructor con:constructors) {
			System.out.println(con);
		}
	}
}