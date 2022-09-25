package chapter02.homeworks;

import java.util.Scanner;

public class Homework14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Health application: computing Body Mass Index (BMI)
		
		System.out.print("Enter weight in pounds: ");
		double weight =  input.nextDouble();
		//one pound is 0.45359237
		double weightKilograms = weight * 0.45359237;
		
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		//one inch is 0.0254 meters
		double heightMeters = height * 0.0254;
		
		double bodyMassIndex = weightKilograms / (heightMeters * heightMeters);
						
		System.out.println("BMI is " + (int)(bodyMassIndex * 10000) / 10000.0);		
	}
}
