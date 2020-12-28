package com.briup.ch08;

import java.lang.reflect.Field;

import com.briup.ch07.Gender;
import com.briup.ch07.Point;
import com.briup.ch07.Student;

import javafx.scene.AccessibleAction;

@SuppressWarnings("all")
public class ReflectionDemo4 {
	public static void main(String[] args) throws Exception {
		Point<Long> point = new Point<Long>();
		
		Class<?> cl = point.getClass();
		Field[] fields = cl.getDeclaredFields();
		for(Field f:fields) {
			System.out.println(f);
		}
	}
}