package com.briup.ch07;

public class Classname {
	/*
	 * private String name; private double total; private double average; private
	 * int number;
	 */
	private String name;
	private double total;
	private double average;
	private int number;
	public Classname() {
	}
	Classname(String name){
		this.name = name;
	}
	
	public Classname(String name,Double total,Double average) {
		this.name = name;
		this.total = total;
		this.average = average;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
