package com.greatlearning.corejava;

public class ThreeDimensionShape {
	double width,height,depth;
	

	public ThreeDimensionShape() {
		width=height=depth=0;
	}
	public ThreeDimensionShape(double l) {
		width=height=depth=l;
	}
	public ThreeDimensionShape(double w, double h, double d) {
		width=w;
		height=h;
		depth=d;
	}
	public double volume() {
		return width*height*depth;

	}

	public static void main(String[] args) {
		ThreeDimensionShape tds1 = new ThreeDimensionShape();
		ThreeDimensionShape tds2 = new ThreeDimensionShape(2);
		ThreeDimensionShape tds3 = new ThreeDimensionShape(7,8,9);
		double volume;
		volume = tds1.volume();
		System.out.println("volume of first TDS is "+volume);
		volume = tds2.volume();
		System.out.println("volume of second TDS is "+volume);
		volume = tds3.volume();
		System.out.println("volume of third TDS is "+volume);	

	}

}
