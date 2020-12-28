package com.briup.ch08;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.briup.ch07.Gender;
import com.briup.ch07.Student;

import javafx.scene.AccessibleAction;
import jdk.internal.dynalink.beans.StaticClass;

@SuppressWarnings("all")
public class ReflectionDemo7 {
	public static void main(String[] args) throws Exception {
		Class c = Teacher.class;
		// 调用无惨构造器创建对象
		Object obj = c.newInstance();
		
		System.out.println(obj);
		
		//有参构造器创建对象
		Object[] argsObj = {2L,"nigger"};
		Constructor<?> cons = c.getConstructor(long.class, String.class);
		Object object = cons.newInstance(argsObj);
		System.out.println(object);
	}
}