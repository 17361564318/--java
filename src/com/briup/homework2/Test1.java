package com.briup.homework2;

//分别创建Counter类的对象和Printer类的对象并启动线程类
public class Test1 {

	public static void main(String[] args) {
		Storage s1 = new Storage();
		Counter c = new Counter(s1);
		Printer p = new Printer(s1);
		c.start();
		p.start();
	}

}
