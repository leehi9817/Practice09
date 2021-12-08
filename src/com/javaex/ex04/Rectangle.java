package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {

	private double width;
	private double height;
	
	public Rectangle(double w, double h) {
		super();
		width = w;
		height = h;
	}

	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (width + height) * 2;
	}
	
	public void resize(double s) {
		width = width * s;
		height = height * s;
	}
	
}