package com.briup.homework1;

import java.util.ArrayList;
import java.util.List;

public class Classmate {
		private String name;
		//存学生集合
		private List<Student> list = new ArrayList<>();
		//求总分
		public int sum(){
			int a = 0;//做累和变量
			for (Student student : list) {
				a += student.getScore();
			}
			return a;
		}
		//平均分
		public int avg(){
			return sum()/list.size();//返回  总分除以人数(list.size())
		}
		public Classmate(String name) {
			super();
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Student> getList() {
			return list;
		}
		public void setList(List<Student> list) {
			this.list = list;
		}
		
	}


