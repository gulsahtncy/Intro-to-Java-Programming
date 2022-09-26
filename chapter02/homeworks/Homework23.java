package chapter02.homeworks;

import java.util.Scanner;

public class Homework23 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Cost of driving
		
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble(); 
		
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		double costOfDriving = (distance / milesPerGallon) * pricePerGallon;
		
		System.out.println("The cost of driving is $" + (int)(costOfDriving * 100) / 100.0);	
	}
}
