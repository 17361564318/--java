package com.briup.homework;

import sun.security.util.UntrustedCertificates;

public class Cat extends Animal implements Pet {
//	Cat			
//	-name:String			
//	+Cat(name:String)		
//	+Cat() 				
//	+getName()：String
//	+setName(name:String)
//	+play()
//	+eat()
	 private String name;

	public Cat(String name) {
		super();
		this.name = name;
	}
	
	public Cat() {
	
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
		System.out.println(name+"喜欢玩尾巴");

	}

	@Override
	void eat() {
		System.out.println(name+"喜欢吃鱼");
	}

}
