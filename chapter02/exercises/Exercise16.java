package chapter02.exercises;

import java.util.Scanner;

public class Exercise16 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//interest calculation
		
		System.out.println("Enter the annual interest rate: (Exp. 4.5) ");
		double annualInterestRate = input.nextDouble();
				
		System.out.println("How many years do you want to pay: (Exp. 5) ");
		int numberOfYears = input.nextInt();
		
		System.out.println("Amount to get loaned: (Exp. 1567.98) ");
		double loanAmount = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		
		double totalPayment = monthlyPayment * 12 * numberOfYears;
		
		System.out.println("Mounthly payment: " + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("Total payment: " + (int)(totalPayment * 100) / 100.0);
	}
}
