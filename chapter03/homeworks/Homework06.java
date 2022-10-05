package chapter03.homeworks;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Health application: BMI
		
		// Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();

		// Prompt the user to enter weight in feet
		System.out.print("Enter feet: ");
		double feet = input.nextDouble();

		// Prompt the user to enter weight in inches
		System.out.print("Enter inches: ");
		double inches = input.nextDouble();

		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		final double INCH_PER_FEET = 12;

		// Compute BMI
		double weightInKilograms = pounds * KILOGRAMS_PER_POUND;
		double totalInches = (feet * INCH_PER_FEET) + inches;
		double heightInMeters = totalInches * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		// Display result
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi < 25) {
			System.out.println("Normal");
		} else if (bmi < 30) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}
	}
}
