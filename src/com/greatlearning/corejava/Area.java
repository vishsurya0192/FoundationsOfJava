package com.greatlearning.corejava;

public class Area {
	final double pi=3.14;
	double radius, result;

	public Area(double r) {
		radius =r;
		result =pi*r*r;
		System.out.println("result is "+result);	
		
	}

	public static void main(String[] args) {
		Area area =new Area(7);

	}

}
