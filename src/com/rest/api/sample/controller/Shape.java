package com.rest.api.sample.controller;

abstract class Shape {
	String color;

	// these are abstract methods
	 double area() {
		return 0.0;
	}

	public abstract String toString();

	// abstract class can have constructor
	public Shape(String colorfromCircle) {
		System.out.println("Shape constructor called before "+this.color);
		this.color = colorfromCircle;
		System.out.println("Shape constructor called after "+this.color);
	}

	// this is a concrete method
	public String getColor() {
		return color;
	}
	
}


