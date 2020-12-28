package com.briup.ch06;

public class AccessDemo {
	
	public String pubStr = "pubStr";//所有地方
	protected String proStr = "proStr";//子类中、同包中可以访问
	String defStr = "defStr";//包访问权限，同包可以访问。
	private String priStr = "priStr";//当前类中
	public void test() {
		System.out.println(this.pubStr);
		System.out.println(this.proStr);
		System.out.println(this.defStr);
		System.out.println(this.priStr);
	}
	
	public static void main(String[] args) {
		AccessDemo  t = new AccessDemo();
		t.test();
	}
}
