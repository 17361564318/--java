package com.briup.ch06;

public class StaticOutter {
	private String name;
	private static int age;
	
	public void hello() {
		StaticInner sic = new StaticInner();
		System.out.println(sic.name);//对象访问
		System.out.println(StaticInner.age);//类名访问
	}

	public static class StaticInner {
		private String name;
		private static int age;

		public void test(String name) {
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(StaticOutter.age);
		}
	}

}
