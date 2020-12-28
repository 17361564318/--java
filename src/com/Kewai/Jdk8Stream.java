package com.Kewai;

import java.util.stream.Stream;

public class Jdk8Stream {
	public static void skip(long a) {
		Stream<Integer> stream = Stream.of(1, 2, 4, 6, 8);
		stream.skip(a).forEach(integer -> System.out.println("剩下的流为：" + integer));

	}

	public static void limit(long maxsize) {
		Stream<Integer> stream = Stream.of(1, 2, 4, 6, 8);
		stream.limit(maxsize).forEach(integer -> System.out.println("剩下的流为：" + integer));

	}

	public static void main(String[] args) throws Exception {
		Jdk8Stream.skip(4);
		Jdk8Stream.limit(3);
	}
}
