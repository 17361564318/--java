package com.briup.jdk8.limitandskip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LimitandSkip {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("h", "e", "l", "l", "o");
		list.stream().limit(2).forEach(System.out::println);// 只要前两个元素
		list.stream().skip(2).forEach(System.out::println);// 跳过前两个元素
		Stream.generate(()->
		(int)(Math.random()*100)).limit(100).forEach(System.out::println);
	}
	
}
