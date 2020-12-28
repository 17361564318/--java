package com.briup.ch08;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.briup.ch07.Gender;
import com.briup.ch07.Student;

import javafx.scene.AccessibleAction;
import jdk.internal.dynalink.beans.StaticClass;

@SuppressWarnings("all")
public class ReflectionDemo6 {
	public static void main(String[] args) throws Exception {
		Class c = Teacher.class;

		Teacher t = new Teacher(1L, "tom");
		// 类中声明的所有方法,包括私有的
		Method[] declaredMethods = c.getDeclaredMethods();
		for (Method m : declaredMethods) {
			System.out.println(m.getName());
			System.out.println(Modifier.toString(m.getModifiers()));
			System.out.println(m.getParameterCount());
			System.out.println(Arrays.toString(m.getParameters()));
			System.out.println("---------");
		}
		System.out.println("**************************");
		// 调用无惨方法
//		Method method = c.getMethod("test");
//		Object obj = method.invoke(t);
//		System.out.println(obj);

		// 调用有参方法
//		String methodName = "sayHello";
//		Method method2 = c.getMethod(methodName, String.class);
//		Object rv = method2.invoke(t, "zs");
//		System.out.println(rv);
//		
		// 类中所有的public，包含继承方法
//		Method[] methods = c.getMethods();
//		for (Method m : methods) {
//			System.out.println(m.getName());
//		}

	}

}

/*
 * public static void test(Object obj,String methodName,) { String methodName =
 * ""; Class<?> c = obj.getclass(); Class<?>[] argsClasses = {}; Object[]
 * argsObj = {}; Method method = c.getMethod(methodName, argsClasses); Object
 * obj = method.invoke(methodName, argsClasses); System.out.println(obj); }
 */
