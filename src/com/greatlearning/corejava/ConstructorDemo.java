package com.greatlearning.corejava;

/* Algorithm for default and parameterized constructor
 * 1. Start
 * 2. create class ConstructorDemo 
 * 3. Create one default and parameterized constructor
 * 4. introduce your self in default constructor
 * 5. in parameterized constructor pass arguments as full name, age, location
 * 6. create main method
 * 7. create object of class in main method
 * 8.execute both constructors
 * 9. Stop
 * 
 */

public class ConstructorDemo {

	public ConstructorDemo() {
		String fullName = "Vishakha";
		System.out.println("My Full name is "+fullName);
	}
	public ConstructorDemo(String fullName, int age, String location) {
		System.out.println("My Full Name is: "+fullName+"\nAge:"+age+"\nLocation:"+location);
		
	}

	public static void main(String[] args) {
		ConstructorDemo constructorDemo = new ConstructorDemo();
		constructorDemo = new ConstructorDemo("Vishakha",29,"Atlanta");

	}

}
