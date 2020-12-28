package com.briup.ch06;

public abstract class Animal {
	/*
	 * Animal--abstract +legs:int +Animal(legs:int) +walk() --abstract
	 * +eat()--abstract
	 */
	 private int legs;

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.setLegs(legs);
	}

	public Animal(int legs) {
		this.legs = legs;
	}

	public Animal() {
	}

	public abstract void walk(int legs);// 抽象方法

	public abstract void eat();

}

class Snake extends Animal {
	@Override
	public void walk(int legs) {
		System.out.println("蛇只能蠕动");
	}

	@Override
	public void eat() {
		System.out.println("蛇喜欢吃老鼠");
	}
}

class Cat extends Animal {
	public Cat() {
	}
	
	@Override
	public void walk(int legs) {
		System.out.println("猫" + legs + "条腿走路");
	}

	@Override
	public void eat() {
		System.out.println("猫喜欢吃鱼");
	}

}

class Fish extends Animal {
	@Override
	public void walk(int legs) {
		System.out.println("鱼只能游动");
	}

	@Override
	public void eat() {
		System.out.println("鱼喜欢吃鱼饵");
	}

}