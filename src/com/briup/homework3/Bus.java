package com.briup.homework3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Bus {
	public HashMap<Integer, String> map = new HashMap<Integer, String>();

	public void addMap() {
		map.put(1, "浦东软件园");
		map.put(2, "中创软件");
		map.put(3, "创业大厦");
		map.put(4, "托普学院");
		map.put(5, "阳澄湖庄");
		map.put(6, "湖滨路大禹路");
		map.put(7, "文豪花园");
		map.put(8, "蟹市场");
		map.put(9, "湖滨路迎宾路");
		map.put(10, "玫瑰园");
		map.put(11, "城北西路湖亭路");
		map.put(12, "葡萄研究所");
		map.put(13, "望河桥");
		map.put(14, "黄泥山村");
		map.put(15, "登云学院");
		map.put(16, "马鞍山路思常路");
		map.put(17, "森林公园");
		map.put(18, "森林半岛");
		map.put(19, "马鞍山路鹿城路");
		map.put(20, "长虹大桥 ");

	}

	// 计算价格
	public int getPrice(int start, int end) {
		int a = Math.abs(end - start);
		if (a <= 0) {
			return -1;// 通过price的值来判断有无问题
		} else if (a < 4) {
			return 1;
		} else if (a <= 8) {
			return 2;
		} else if (a <= 12) {
			return 3;
		} else if (a <= 16) {
			return 4;
		}

		return 4 + (a - 16);

	}

	public static void main(String[] args) {
		Bus bus = new Bus();
		Scanner s = new Scanner(System.in);
		bus.addMap();
		Set entrySet = bus.map.entrySet();
		for (Object obj : entrySet) {
			Entry entry = (Entry) obj;
			System.out.println(entry.getKey() + " -- " + entry.getValue());

		}

		System.out.println("请输入上车站序号：");
		int start = s.nextInt();
		if (!bus.map.containsKey(start)) {
			System.out.println("请输入正确的车站");
			return;
		}
		System.out.println("请输入下车站序号：");
		int end = s.nextInt();
		if (!bus.map.containsKey(end)) {
			// 没有的话
			System.out.println("您输入的站点有误");
			return;
		}
		int price = bus.getPrice(start, end);
		if (price < 0) {
			System.out.println("请勿输入相同车站");
			return;
		}
		System.out.println(
				"从" + bus.map.get(start) + "到" + bus.map.get(end) + "共经过" + (Math.abs(end-start)) + "站，收费" + price + "元");
	}
}
