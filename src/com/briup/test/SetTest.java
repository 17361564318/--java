package com.briup.test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

@SuppressWarnings("all")
public class SetTest {
	public static void main(String[] args) {
		TreeSet set = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				
				Cat cat1 = (Cat) o1;
				Cat cat2 = (Cat) o2;
				if (cat1.getId() == cat2.getId()) {
					return cat2.getAge() - cat1.getAge();
				} else {
					return cat1.getId()-cat2.getId();
				}
			}

		});
		Cat cat = new Cat(1, "tuanzi", 4);
		
		
//		set.add(new Cat(1,"tuanzi",3));
//		set.add(new Cat(2,"tuanzi",4));
//		set.add(new Cat(1,"tuanzi",4));
//		set.add(new Cat(12,"tuanzi",4));
//		set.add(new Cat(3,"tuanzi",3));
		//set.forEach(sets -> System.out.println(sets));
		HashSet<Cat> hashSet = new HashSet<Cat>();
		hashSet.add(new Cat(2,"yuanyuan",3));
		hashSet.add(new Cat(1,"yuanyuan",3));
		hashSet.add(new Cat(3,"yuanyuan",3));
		hashSet.add(new Cat(3,"yuanyuan",3));
		hashSet.forEach(sets->System.out.println(sets));
	}
}
