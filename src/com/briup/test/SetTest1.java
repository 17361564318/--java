package com.briup.test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

@SuppressWarnings("all")
public class SetTest1 {
	public static void main(String[] args) {
//		TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				System.out.println("this is o1  "+o1);
//				System.out.println(o2+"   this is o2");
//				return o1.compareTo(o2);
//				
//				
//			}
//		});
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		set.add(5);
//		set.add(6);
//		set.add(7);
//		set.add(8);
//		set.add(9);
//		}	
		HashSet<Dog> set = new HashSet<Dog>();
		set.add(new Dog(1,"ergou",18));
		set.add(new Dog(1,"ergou",19));
		set.add(new Dog(1,"ergou",18));
		set.add(new Dog(1,"ergou",18));
		set.add(new Dog(1,"ergou",18));
		set.add(new Dog(1,"ergou",18));
		set.add(new Dog(1,"ergou",18));
		
		set.forEach(sets->System.out.println(sets));
	}
}