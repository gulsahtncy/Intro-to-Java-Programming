package chapter03.exercises;

import java.util.Scanner;

public class Exercise17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double income = input.nextDouble();
		
		/* The two statements in this checkpoint are equal. 
		 * The first one is better since it is shorter.
		 */
	
		double tax = 0;
		
		// A
		if (income <= 10000)
			tax = income * 0.1;
			else if (income <= 20000)
			tax = 1000 + (income - 10000) * 0.15;
					
		// B
		if (income <= 10000)
			tax = income * 0.1;
			else if (income > 10000 && income <= 20000)	
			tax = 1000 + (income - 10000) * 0.15;	
		
		System.out.println(tax);
	}
}
