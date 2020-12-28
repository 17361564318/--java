package com.briup.homework1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
@SuppressWarnings("all")
public class GuShi {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1,"一行白鹭上青天");
		map.put(5,"不及汪伦赠我情");
		map.put(6,"两岸猿声啼不住");
		map.put(4,"床前明月光");
		map.put(7,"两情若是久长时");
		map.put(2,"锄禾日当午");
		map.put(8,"莫使金樽空对月");
		map.put(9,"在天愿作比翼鸟");
		map.put(3,"何当共建西窗竹");
		map.put(10,"指点江山，挥斥方遒");
		
		//Set set = map.keySet();
		Set entrySet = map.entrySet();
		for(Object obj:entrySet){
			Entry entry = (Entry)obj;
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
//		for (Object object : set) {
//			Object value = map.get(object);
//			System.out.println(object+" "+value);
//		}
	}
}
