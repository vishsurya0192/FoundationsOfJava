package com.greatlearning.corejava;
/* Inheritance example
 * Start
 * 1. create classes InheritanceA, InheritanceB, InheritanceC
 * 2. create methods circleArea, rectangleArea, triangkeArea in each classes A,B and C.
 * 3. Create object object of class InheritanceC
 * 4. call all methids in main method of InheritanceC
 * 
 * 
 * 
 * */
class InheritanceA{
	final double pi= 3.14;
	double radius;
		public void circleArea(double r) {
			this.radius = r;
			double result;
			result = pi*r*r;
			System.out.println("Area of Circle is::"+result);
			}
}
class InheritanceB extends InheritanceA{
	double length, breadth, result;
	public void rectangleArea(double l, double b) {
		this.length =l;
		this.breadth =b;
		result = l*b;
		System.out.println("Area of Rectangle is::"+result);	
	}
}

public class InheritanceC extends InheritanceB {
	double height, base, result;
	public void triangleArea(double h, double b) {
		this.height = h;
		this.base = b;
		result = 0.5*h*b;
		System.out.println("Area of Triangle is::"+result);
	}

	public static void main(String[] args) {
		InheritanceC inheritanceC = new InheritanceC();
		inheritanceC.circleArea(4);
		inheritanceC.rectangleArea(5, 6);
		inheritanceC.triangleArea(10, 6);
		
	}

}
