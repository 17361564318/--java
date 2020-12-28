package com.Kewai;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FunctionInterface {
//		List<String> list = new ArrayList<String>();
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.stream().forEach((value)->{System.out.println(value);});
		
		
//	}
	
	public static void main(String[] args) throws Exception {
		int random =(int)(Math.random()*10);
		int random1 =(int)(Math.random()*10);
		
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		List<Integer> list = new ArrayList<Integer>();
		list.add(random);
		list.add(random1);
		Integer integer = list.stream().min(comparator::compare).get();
		
	}
	

}
