package com.briup.homework1;

public enum Color {
	// 写一个枚举类型，表示出三种基本颜色RBG,并且提供有参数构造器，给出每种颜色的名字
	R, B, G;
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Color(String name) {
		this.name = name;
		System.out.println("有参构造器");
	}
	private Color() {
	}

}
class Test1{
	public static void main(String[] args) {
		Color.R.setName("hongse");
		Color.B.setName("lanse");
		Color.G.setName("lvse");
		System.out.println(Color.R.getName());
		System.out.println(Color.B.getName());
		System.out.println(Color.G.getName());
	}
}