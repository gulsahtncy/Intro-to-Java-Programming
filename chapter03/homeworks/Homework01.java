package chapter03.homeworks;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Algebra: solve quadratic equations	
		System.out.println("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = (b * b) - (4 * a * c);
		
		if (discriminant > 0) {
				double realRoot1 = (- b + (Math.pow(discriminant, 0.5))) / (2 * a);
				double realRoot2 = (- b - (Math.pow(discriminant, 0.5))) / (2 * a);
				System.out.println("The equation has two roots " + 
				(int)(realRoot1 * 1000000) / 1000000.0 + " and " + (int)(realRoot2 * 1000000) / 1000000.0);		
		}
		else if (discriminant == 0) {
				double realRoot3 = (- b) / (2 * a);
				System.out.println("The equation has one root " + realRoot3);
		}	
		else
				System.out.println("The equation has no real roots");	
	}
}
