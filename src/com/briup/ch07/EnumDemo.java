package com.briup.ch07;

public class EnumDemo {
	public static void main(String[] args) {
	Gender g1 = Gender.M;
	Gender g2 = Gender.F;

	Gender g3 = Gender.valueOf("M");
	Gender g4 = Gender.valueOf("F");

	
	Gender g5 = Enum.valueOf(Gender.class,"M");
	Gender g6 = Enum.valueOf(Gender.class,"F");
	System.out.println(g1 == g3 );
	System.out.println(g2 == g4 );
	
	Gender[] values = Gender.values();
	for(Gender gender :values) {
		//枚举的父类型重写了toString方法
		//java.lang.Enum,所有枚举的父类
		System.out.println(gender);
	}
	}
}
