package com.greatlearning.corejava;

public class StaticFinalDemo {
	int var1 =10;
	static int var2 =10;
	public void method1() {
		var1++;
		System.out.println(var1);
	}
	public void method2() {
		var2++;
		System.out.println(var2);
	}
	

	public static void main(String[] args) {
		StaticFinalDemo sfd1 = new StaticFinalDemo();
		StaticFinalDemo sfd2 = new StaticFinalDemo();
		StaticFinalDemo sfd3 = new StaticFinalDemo();
		System.out.println("Using non static variable:::");
		sfd1.method1();
		sfd2.method1();
		sfd3.method1();
		System.out.println("\nUsing Static variable:::");
		sfd1.method2();
		sfd2.method2();
		sfd3.method2();
		
		
		
	}

}
