package com.Kewai.suanfa;

import java.util.Arrays;

public class SumOfNumber {

	public static void main(String[] args) throws Exception {
		int[] a = {1,5,6,7,8,2};
		int[] sum = SumOfNumber.sum(a, 9);
		System.out.println(Arrays.toString(sum));
	}

	public static int[] sum(int[] sums, int target) throws Exception {
		for (int i = 0; i < sums.length; i++) {
			for (int j = i + 1; j < sums.length; j++) {
				if (sums[j] == target - sums[i]) {
					return new int[] { i, j };
				}
			}
		}
		throw new Exception("出了错");
	}
}
