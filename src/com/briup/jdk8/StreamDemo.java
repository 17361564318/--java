package com.briup.jdk8;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("hello", "world", "tom");
		String[] strArray = s1.toArray(String[]::new);
		System.out.println(Arrays.toString(strArray));
	}
}
