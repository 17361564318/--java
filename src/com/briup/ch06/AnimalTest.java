package com.briup.ch06;
@SuppressWarnings("all")
public class AnimalTest {
	public static void main(String[] args) {
		Animal a = null;
		a = new Snake();
		a.setLegs(4);
		a.walk(a.getLegs());
		a.eat();
		a = new Cat();
		a.setLegs(4);
		a.walk(a.getLegs());
		a.eat();
		a = new Fish();
		a.setLegs(0);
		a.walk(a.getLegs());
		a.eat();
	}
}
