package chapter02.homeworks;

import java.util.Scanner;

public class Homework09 {
	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		//Physics: acceleration
		
		System.out.print("Enter v0, v1, and t: ");
		double startingVelocity = input.nextDouble();
		double endingVelocity = input.nextDouble();
		double timeSpan = input.nextDouble();
		
		double averageAcceleration = (endingVelocity - startingVelocity) / timeSpan;
		
		System.out.println("The average acceleration is " + (int)(averageAcceleration * 10000) / 10000.0);	
	}
}
