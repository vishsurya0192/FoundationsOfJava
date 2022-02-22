package vishakha.gl.foundationsofjava;

/* Created Vishakha, 02/02/22
 * Algorithm to create a class Customer 
 * 1. Start
 * 2. create class Customer
 * 3. define 2 variables fullName as String type and age as int type
 * 4. create main method in same class
 * 5. create object of the Customer class
 * 6. assign values to these variables
 * 7. print the values
 * 7. Stop
 * */

public class Customer {
String fullName;
int age;

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.fullName = "Vishakha Suryawanshi";
		customer.age = 29;
		System.out.println("Customer information:----> \n"+"Name: "+customer.fullName+"\nAge: "+ customer.age);	

	}

}
