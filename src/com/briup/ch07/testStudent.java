package com.briup.ch07;

import java.util.ArrayList;
import java.util.List;

import com.briup.homework1.Classmate;
import com.briup.homework1.Student;

@SuppressWarnings("all")
public class testStudent {
	public static void main(String[] args) {
		Classmate c1 = new Classmate("一班");
		Classmate c2 = new Classmate("二班");
		Student student1 = new Student("tom", c1, 88);
		Student student2 = new Student("tom**", c1, 85);
		Student student3 = new Student("tom**", c1, 86);
		
		Student student4 = new Student("tom**", c2, 87);
		Student student5 = new Student("tom**", c2, 81);
		Student student6 = new Student("tom**", c2, 80);
		c1.getList().add(student1);
		c1.getList().add(student2);
		c1.getList().add(student3);
		
		c2.getList().add(student4);
		c2.getList().add(student5);
		c2.getList().add(student6);
		//打印1班
		System.out.println(c1.getName()+"的总分为"+c1.sum());
		System.out.println(c1.getName()+"的均分为"+c1.avg());
		//打印2班
		System.out.println(c2.getName()+"的总分为"+c2.sum());
		System.out.println(c2.getName()+"的均分为"+c2.avg());

	}
}
