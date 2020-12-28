package com.briup.homework;

public class Fish extends Animal implements Pet {
//	-name:String
//	+Fish() 				
//	+getName()：String
//	+setName(name:String)
//	+play()
//	+walk()
//	+eat()
	String name;

	public Fish() {
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void setname(String name) {
		this.name = name;

	}

	@Override
	public void play() {
		System.out.println(name + "喜欢游泳");
	}

	@Override
	void eat() {
		System.out.println(name+"想吃肉");
	}

	public void walk() {
System.out.println(name+"就不想散步");
	}

}
