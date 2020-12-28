package com.briup.ch07;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo4 {
	public static void main(String[] args) {

		Mypoint<subA> mypoint = new Mypoint<subA>();

	}
}

class Mypoint<T extends A & B> {
}

class A {
}

interface B {
}

class subA extends A implements B {
}