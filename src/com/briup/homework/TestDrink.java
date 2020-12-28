package com.briup.homework;

import java.util.Scanner;

public class TestDrink {
	
	public Object choose() {
		System.out.println("请选择");
		System.out.println("1.咖啡");
		System.out.println("2.礦泉水");
		System.out.println("3.可乐");
      Scanner scanner = new Scanner(System.in);
      int i =scanner.nextInt();
      switch (i) {
	case 1:
		System.out.println("请选择,你要加什么");
		System.out.println("1.+加奶");
		System.out.println("2.+加糖");
		System.out.println("3.+加奶+加糖");
		System.out.println("4.不加");
		int j = scanner.nextInt();
		Coffee coffee = new Coffee();
		if (j==1) {
			coffee.setFriend("加奶的咖啡");
			System.out.println("你要的简爱的咖啡");
		} else if (j==2) {
			coffee.setFriend("加糖的咖啡");
			System.out.println("你要的加糖的咖啡");
		}else if (j==3) {
			coffee.setFriend("加糖加奶的咖啡");
			System.out.println("你要的加糖加奶的咖啡");
		}else {
			coffee.setFriend("白咖啡");
			System.out.println("你要的啥都没有的咖啡");
		}
		return coffee;
	case 2:
		System.out.println("你要的矿泉水");
		return new Water();
		
	case 3:
		System.out.println("请选择你要啥可乐");
		System.out.println("1.可口可乐");
		System.out.println("2.百事可乐");
		int k = scanner.nextInt();
		Cola cola = new Cola();
		if (k==1) {
			cola.setName("你要的可口可乐");
			System.out.println("你的可口可乐");
		} else{
			cola.setName("你要的拜师可乐");
			System.out.println("你的百事可乐");
		}
		return cola;
		
		
	default:
		return null;
	}
	}
	public static void main(String[] args) {

		TestDrink t = new TestDrink();
		Object choose = new Object();
		t.choose();
	}

}
