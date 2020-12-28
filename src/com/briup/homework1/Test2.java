package com.briup.homework1;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		Student student1 = new Student(1108, Gender.F, "Eve", "09", 99);
		Student student2 = new Student(1108, Gender.M, "Eve", "09", 97);
		Student student3 = new Student(1108, Gender.M, "Eve", "09", 100);
		Student student4 = new Student(1108, Gender.F, "Eve", "09", 12);
		Student student5 = new Student(1108, Gender.M, "Eve", "09", 65);
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		arrayList.add(student5);
		int sum = 0;
		for (Student student : arrayList) {
			sum += student.getScore();
		}
		int avg = sum/arrayList.size();
		System.out.println("班里的平均分是  ："+avg);
	}
}
