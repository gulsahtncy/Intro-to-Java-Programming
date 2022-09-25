package chapter02.homeworks;

import java.util.Scanner;

public class Homework10 {
	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		//Science: calculating energy
		
		System.out.print("Enter the amount of water in kilograms: ");
		double waterKilograms = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		double neededEnergy = waterKilograms * (finalTemperature - initialTemperature) * 4184;		
		System.out.println("The energy needed is " + neededEnergy);
	}
}
