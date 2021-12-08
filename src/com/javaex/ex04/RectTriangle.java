package com.javaex.ex04;

public class RectTriangle extends Shape {

	private double width;
	private double height;
	
	public RectTriangle(double w, double h) {
		super();
		width = w;
		height = h;
	}
    
	public double getArea() {
		return width * height * 0.5;
	}
	
	public double getPerimeter() {
		return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
}