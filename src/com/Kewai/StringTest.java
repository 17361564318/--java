package com.Kewai;

import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
	private static <T extends Comparable<T>> int binarySearch(T[] x, int low, int high, T key) {
		if (low <= high) {
			int mid = low + ((high - low) >> 1);
			if (key.compareTo(x[mid]) == 0) {
				return mid;
			} else if (key.compareTo(x[mid]) < 0) {
				return binarySearch(x, low, mid - 1, key);
			} else {
				return binarySearch(x, mid + 1, high, key);
			}
		}
		return -1;
	}

	public static void main(String[] args) throws Exception {
//	String str = "北京市(朝阳区)(西城区)(海淀)";
//	   Pattern p = Pattern.compile(".*?(?=\\()");
//       Matcher m = p.matcher(str);
//       if(m.find()) {
//           System.out.println(m.group());
//       }
//		System.out.println(String.class);
//		System.out.println("123".getClass());
//		System.out.println(Class.forName("java.lang.String"));

//		String newInstance = String.class.newInstance();
//		newInstance ="mother fuck";
//		System.out.println(newInstance);
//		String string = String.class.getConstructor(String .class).newInstance("fuck you");
//		System.out.println(string);

//		String str = "hello";
//		Method method = str.getClass().getMethod("toUpperCase");
//		System.out.println(method.invoke(str));
		System.out.println((5+1)>>>4);
		System.out.println((5+1)<<4);
		int a=1;
		System.out.println(a==1?"yes":"no");
	}

}
