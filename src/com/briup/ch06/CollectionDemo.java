
package com.briup.ch06;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
@SuppressWarnings("all")
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c = null;
		 c = new ArrayList();
		 c.add(1);
		 c.add("hello");
		 c.add(new Object());
		 
		 System.out.println(c.contains("hello"));
		 System.out.println(c.size());
//		 c.clear();
//		 System.out.println(c.size());
		System.out.println(c.getClass()); 
		 Iterator it = c.iterator();
		 
		 while (it.hasNext()) {
			 Object obj = it.next();
			System.out.println(obj);
		}
	}
	

}
