package com.subex.javatraining.abstractdemo;

public class Triangle  extends Geometry
{
	double base = 10.5;
	double height = 20;
	@Override
	public void area() {
		System.out.println(0.5 * base * height );
	}
}
