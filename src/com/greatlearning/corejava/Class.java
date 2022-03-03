package com.greatlearning.corejava;
//coding challenge 9

public class Class {
	void copyMe() {
		System.out.println("Inside copy me method");
	}

	public static void main(String[] args) {
		Class obj = new Class();
		obj.copyMe();

	}

}
