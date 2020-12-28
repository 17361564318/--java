package com.briup.homework1;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

@SuppressWarnings("all")
public class YanZhen {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = set.size(); set.size() < 4; i--) {
			 Random random = new Random();
			set.add(random.nextInt(10));
		}
		for (Integer integer : set) {
			System.out.print(integer);
		}
	}
}
