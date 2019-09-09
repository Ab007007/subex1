package com.subex.javatraining.abstractdemo;

public class Circle extends Geometry implements GeometricElements
{

	private static final double PI = 3.142;
	private double radius = 2;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(PI * radius * radius);
	}
	
	@Override
	public void printElementState() {

		System.out.println("Radius is " + radius);
		System.out.println("Geometic Element is " + geometryicElement1);
	}
}
