package chapter02.homeworks;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		
		//Convert feet into meters
		
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		
		//one foot is 0.305 meter
		double meter = feet * 0.305;
		
		System.out.println(feet + " feet is " + meter + " meters");		
	}
}
