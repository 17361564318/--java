package com.briup.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StreamTest {
	public static void main(String[] args) {
		int max = 1000000;
		List<String> list = new ArrayList<String>(max);
		for (int i = 0; i < max; i++) {
			UUID uuid = UUID.randomUUID();
			list.add(uuid.toString());
		}

		// 1纳秒*10^9=1秒
		long t0 = System.nanoTime();
		// 串行stream
		// long count = list.stream().sorted().count();
		// 并行stream
		long count = list.parallelStream().sorted().count();
		long t1 = System.nanoTime();

		long time = t1 - t0;
		System.out.println(count);
		System.out.println(time);
	}
}
