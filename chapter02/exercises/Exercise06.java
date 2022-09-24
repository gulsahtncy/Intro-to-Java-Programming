package chapter02.exercises;

public class Exercise06 {
	public static void main(String[] args) {
		
		//Step 1: Declare a double variable named miles with initial value 100.
		double mile = 100;
		
		//Step 2: Declare a double constant named KILOMETERS_PER_MILE with value 1.609.
		final double KILOMETERS_PER_MILE = 1.609;
		
		/*Step 3: Declare a double variable named kilometers, multiply miles and 
	KILOMETERS_PER_MILE, and assign the result to kilometers.*/
		double kilometers = mile * KILOMETERS_PER_MILE;
		
		//Step 4: Display kilometers to the console.
		System.out.println(kilometers);
	}
}