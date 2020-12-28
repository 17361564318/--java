package com.briup.test;

public class Dog {
	private int id;
	private String nameString;
	
	@Override
	public String toString() {
		return "Dog [id=" + id + ", nameString=" + nameString + ", age=" + age + "]";
	}
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Dog(int id, String nameString, int age) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.age = age;
	}
public Dog() {
	// TODO Auto-generated constructor stub
}
@Override
public boolean equals(Object obj) {
	Dog dog = (Dog)obj;
	boolean flag = this.id == dog.id;// TODO Auto-generated method stub
	if (flag) {
		return this.age ==dog.age;
	}
	return flag;
}
@Override
public int hashCode() {
	
	return this.id;
}
}
