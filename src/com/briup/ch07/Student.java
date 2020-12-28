package com.briup.ch07;

public class Student {
	private String studentname;
	private String classname;
	private int score;

	public Student() {
	}

	public String getStudentName() {
		return studentname;
	}

	public void setStudentName(String studentname) {
		this.studentname = studentname;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String studentname, String classname) {
		this.studentname = studentname;
		this.classname = classname;
	}

	public Student(String studentname, String classname, int score) {
		this.studentname = studentname;
		this.classname = classname;
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "姓名：" + studentname + ", 班级：" + classname + ", 成绩：" + score;
	}

}
