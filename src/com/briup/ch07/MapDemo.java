package com.briup.ch07;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
@SuppressWarnings("all")
public class MapDemo {
	public static void main(String[] args) {
		Map map = null;
		map = new HashMap();
		map.put(1, "hell1");
		map.put(2, "hell2");
		map.put(3, "hell3");
		map.put(4, "hell4");
		
		System.out.println("---------------");
		Set keySet = map.keySet();
		for(Object key:keySet) {
			Object value = map.get(key);
			System.out.println(key+"   "+value);
		
		}
		for(Object object: map.values()) {
			System.out.println(object);
		}
		Set entrySet = map.entrySet();
		for(Object obj:entrySet){
			Entry entry = (Entry)obj;
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

}
