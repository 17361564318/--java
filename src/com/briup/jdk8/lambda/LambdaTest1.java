package com.briup.jdk8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaTest1 {
	public static void main(String[] args) {
		List<String> list = 
				Arrays.asList("hello2", "hello1", "hello3", "hello4");
//		Collections.sort(list, (String s1,String s2)->{
//			return s1.compareTo(s2);
//		});
		//参数类型，自动推导
//		Collections.sort(list, (s1, s2)->{
//			return s1.compareTo(s2);
//		});
		
		//方法的实现，只有一句代码，可以省略大括号，
		//return关键字也可以省略
		
		//() ->{};
		Collections.sort(list, (s1, s2)-> s1.compareTo(s2));
		for (String s : list) {
			System.out.println(s);
		}
	}
}
