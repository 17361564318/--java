package com.briup.test;

public class Cat implements Comparable {
	private int id;
	private String name;
	private int age;

	public Cat(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Cat() {
	}

	@Override
	public int compareTo(Object o) {
//		Cat cat = (Cat) o;
//		if (cat.id == this.id) {
//			return cat.age - this.age;
//		} else {
//			return this.id - cat.id;
//		}
		return 1;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Cat cat = (Cat)obj;
		return this.id == cat.id;
	}
}
