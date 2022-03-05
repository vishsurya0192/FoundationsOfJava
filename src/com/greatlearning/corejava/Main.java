package com.greatlearning.corejava;
/*Coding Challenge 11----Multilevel Inheritance
 * 1. Create three Classes Account, CurrentAccount, AccountDetails
 * 2. Account Class is the super Class
 * 3. two variables customerName (of type String), accountNo(of type int)
 * 4. create parameterized constructor Account(String a, int b) assign it to variables declare
 * 5. Create a method display of type void to display customerName and accountNo
 * 6. CurrentAccount class will extend Account class
 * 7. variable currentBalance (of type int)
 * 8. parameterized constructor  CurrentAccount(String a, int b, int c)
 * 9. super keyword inside Constructor to access Account constructor and assign currentBalance to c.
 * 10. Create a method display of type void to display (customerName, AccountNo, CurrentBalance)
 * 11. Inside display method use super keyword to display customerName and accountNo
 * 12. AccountDetails will extend CurrentAccount
 * 13. Declare two variables depositAmount, withdrawalAmount of type Int.
 * 14. AccountDetails class will contain a parameterized constructor as follows
 * 15. AccountDetails(String a, int b, int c, int d, int e)
 * 16. Use super keyword inside Constructor to access CurrentAccount constructor and assign depositAmount and withdrawalAmount to d and e respectively.
 * 17. Create a method display of type void to display (customerName, accountNo, CurrentBalance,depositAmount, withdrawalAmount)
 * 18. Inside display method use super keyword to display customerName, accountNo,currentBalance)
 * 19. Create a driver class main
 * 20. Create an object of AccountDetails and pass customerName, accountNo, CurrentBalance,depositAmount, withdrawalAmount in constructor.
 * 21. Call display method of AccountDetails class.
 */

class Account{
	String customerName;
	int accountNo;
	Account(String a, int b){
		this.customerName = a;
		this.accountNo = b;
	}
	void display() {
		System.out.println("Account::"+customerName+" "+accountNo);
	}
	
	
}

class CurrentAccount extends Account{
	int currentBalance;
	CurrentAccount(String a, int b, int c){
		super(a,b);
		this.currentBalance = c;
	}
	void display() {
		super.display();
		System.out.println("Current Account::"+currentBalance);
	}
	
}
class AccountDetails extends CurrentAccount{
	int depositAmount, withdrawalAmount;
	AccountDetails(String a, int b, int c, int d, int e){
		super(a,b,c);
		this.depositAmount = d;
		this.withdrawalAmount = e;
	}
	void display() {
		super.display();
		System.out.println("Account Details::"+depositAmount+" "+withdrawalAmount);
	}
	
}
public class Main {

	public static void main(String[] args) {
		AccountDetails accountDetails = new AccountDetails("Vishakha", 1234, 10000, 1000, 500);
		accountDetails.display();		

	}

}
