package com.briup.homework;

public class testAnimal {
	public static void main(String[] args) {
		Cat cat = new Cat("小花");
	//cat.setname("小花");
	cat.eat();
	cat.play();
	Spider spider = new Spider();
	spider.eat();
	Fish fish = new Fish();
	fish.setname("小鲤鱼");
	fish.eat();
	fish.play();
	fish.walk();
	}

}
