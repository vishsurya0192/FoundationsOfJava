package com.greatlearning.corejava;

/*Algorithm : Implement access modifier functionality
 * 1. Start
 * 2. create package com.greatlearning.corejava
 * 3. create classes Health and HealthDriver
 * 4. declare variables int age, float weight, float bmi inside class Health. assign values
 * 5. use access modifier as protected
 * 6. create main method in HealthDriver class
 * 7. Create an object of class Health in HealthDriver class
 * 5. display all variables in class HealthDriver
 * 6. Stop
 * 
 * 
 * */

class Health{
	protected int age = 29;
	protected float weight = 47;
	protected float bmi=  19;
}

public class HealthDriver {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Health health = new Health();
		System.out.println("variables are: \n"+health.age+"\n"+health.weight+"\n"+health.bmi);

	}

}
