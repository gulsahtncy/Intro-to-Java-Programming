package chapter02.homeworks;

import java.util.Scanner;

public class Homework20 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Financial application: calculate interest
		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		
		//Formula : interest = balance * ( annualInterestRate / 1200 )
		
		double interest = balance * (annualInterestRate / 1200);
		
		System.out.println("The interest is " + (int)(interest * 100000) / 100000.01);		
	}
}
