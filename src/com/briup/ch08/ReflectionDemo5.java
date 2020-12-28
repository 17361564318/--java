package com.briup.ch08;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.briup.ch07.Gender;
import com.briup.ch07.Student;

import javafx.scene.AccessibleAction;
import jdk.internal.dynalink.beans.StaticClass;

@SuppressWarnings("all")
public class ReflectionDemo5 {
	public static void main(String[] args) throws Exception {
		Class c = Teacher.class;
		Teacher teacher = new Teacher(1L, "tom");
		//访问类中属性
		Field[] decFields = c.getDeclaredFields();
		for (Field f : decFields) {
			System.out.println(f.getModifiers());
			System.out.println(f.getName());
			// System.out.println(Modifier.isPublic(f.getModifiers()));
			System.out.println(f.getType());
			System.out.println(Modifier.toString(f.getModifiers()));
			if (Modifier.isStatic(f.getModifiers())) {
				Object v = f.get(null);
				System.out.println(v);
			} else {
				if (Modifier.isPrivate(f.getModifiers())) {
					f.setAccessible(true);
				}
				Object v = f.get(teacher);
				System.out.println(v);
			}
		}

		System.out.println("-----------");
		Field[] fields = c.getFields();
		for (Field f : fields) {
			System.out.println(f.getName());
		}
	}
}

class Teacher {
	private long id;
	private String name;
	public static int age = 30;

	public Teacher() {
	}

	public Teacher(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}

	public void test() {
		System.out.println("hello");
	}

	public String sayHello(String name) {
		return "hi       " + name;
	}

	public static void run() {
		System.out.println("run..");
	}

}