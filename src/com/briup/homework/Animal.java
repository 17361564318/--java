package com.briup.homework;
@SuppressWarnings("all")
public abstract class Animal {
//	#legs:int			
//	#Animal(legs:int)	
//	+walk()		       
//	+eat()--abstract	
	private String name;
	private int legs;
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public Animal(int legs) {
		this.legs = legs;
	}
	public   void walk() {
		
	};
	abstract void eat();

}
