package com.briup.homework1;

import java.util.ArrayList;

public class Student {
	private int id;
	private Gender gender;
	private String name;
	private String classmate;
	private int score;

	public Student(int id, String name, String classmate, int score) {
		super();
		this.id = id;
		this.name = name;
		this.classmate = classmate;
		this.score = score;
	}
	public Student(int id, Gender gender, String name, String classmate, int score) {
		super();
		this.id = id;
		this.gender = gender;
		this.name = name;
		this.classmate = classmate;
		this.score = score;
	}

	public Student(String string, Classmate c1, int i) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassmate() {
		return classmate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setClassmate(String classmate) {
		this.classmate = classmate;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		score = score;
	}

}

