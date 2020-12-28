package com.briup.homework;

public class Cylinder implements C {
	// 定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、
	// 圆柱体的高height、颜色color。
	private double radius;
	private double height;
	private String color;

	public Cylinder() {
	}

	public Cylinder(int radius, int height, String color) {
		this.radius = radius;
		this.height = height;
		this.color = color;
	}
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public double area() {
		double area ;
		area = radius*radius*PI*height;
		System.out.println("圆柱体的表面积为："+area);
		return 0;
	}

	@Override
	public void setColr(String c) {
		color = c;
		System.out.println("这个圆柱体的颜色是："+c);

	}

	@Override
	public void volume() {
		double volume;
		volume = height*radius*radius*PI;
		System.out.println("圆柱体的体积为"+volume);

	}

}
