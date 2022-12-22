package chapter05.listing;

public class H_TestSum {
	public static void main(String[] args) {		
	
		// Initialize sum
		double sum = 0; // change float in the program to double
		
		// Add 0.01, 0.02, ..., 0.99, 1 to sum
		for (double i = 0.01f; i <= 1.0f; i = i + 0.01f) // change float in the program to double
		sum += i;
		
		// Display result
		System.out.println("The sum is " + sum);
	}
}
