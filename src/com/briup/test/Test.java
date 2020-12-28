package com.briup.test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
//		int[] a = { 1, 6, 5, 8, 3, 4, 7 };
//		System.out.println("排序前的数组为" + Arrays.toString(a));
//		for (int i = 0; i < a.length - 1; i++) {
//			int index = i;// 用于存储最小数的下标
//			for (int j = i+1; j < a.length; j++) {
//				if (a[index]>a[j]) {
//					index = j;
//				}
//			}
//			int temp;
//			temp = a[i];
//			a[i] = a[index];
//			a[index]= temp;
//		}System.out.println("排序的数组为"+Arrays.toString(a));
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < i+1; j++) {
				System.out.print("☆");
			}

			System.out.println();
		}
		return;
	}
	
}
