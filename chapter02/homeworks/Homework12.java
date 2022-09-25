package chapter02.homeworks;

import java.util.Scanner;

public class Homework12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 
		//Physics: finding runway length
		
		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		double length = (speed * speed) / (2 * acceleration);
		
		System.out.println("The minimum runway length for this airplane is " + 
		(int)(length * 1000) / 1000.0); 
	}
}
