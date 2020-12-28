package com.briup.ch12;

import java.util.Scanner;

public class Main {
//	第1行为产品种类数
//	接下来的每行为每种产品的价格
//	最后一行为预算金额
//	输出：   能买到的最少的产品的件数，无法没有匹配的返回-1
	public static int solution(int[] price, int budget) {
		
		return solution(price, budget);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res = in.nextInt();

		int _prices_size = 0;
		_prices_size = Integer.parseInt(in.nextLine().trim());
		int[] _prices = new int[_prices_size];
		int _prices_item;
		for (int _prices_i = 0; _prices_i < _prices_size; _prices_i++) {
			_prices_item = Integer.parseInt(in.nextLine().trim());
			_prices[_prices_i] = _prices_item;
		}

		int _budget;
		_budget = Integer.parseInt(in.nextLine().trim());

		res = solution(_prices, _budget);
		System.out.println(String.valueOf(res));

	}

}
