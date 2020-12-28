package com.briup.ch06;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.Name;

@SuppressWarnings("all")
public class Student {
	/*
	 * 现在要做一个学生入学报到欢迎系统
	 * 
	 * 每次有新的学生报到的时候提示
	 * 
	 * 欢迎你name同学 你是第N位报到的同学。
	 * 
	 */
	private int age;
	{
		
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public Student(int age, long id, String name) {
		super();
		this.age = age;
		this.id = id;
		this.name = name;
	}

	private long id;
	private String name;
	int n;

	public static void main(String[] args) {
		for (int i = 1;; i++) {
			Student s = new Student(21, 1L, "ton");
			System.out.println("请输入你的名字：");
			Scanner sc = new Scanner(System.in);
			

			String a = sc.nextLine();
			s.name = a;
			if (a.equals("退出系统")) {
				System.out.println("退出系统");
				break;
			} else {
				System.out.println("欢迎你" + s.name + "同学" + "你是第" + i + "个报到的同学");
			}
		}

	}

	@Override
	/*
	 * 相同对象的哈希值，也是相同的；
	 * 哈希值不同的对象，一定是不相同的
	 *  哈希值相同的两个值，有可能相同，有可能不同。
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", name=" + name + ", n=" + n + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
