package chapter02.homeworks;

import java.util.Scanner;

public class Homework13 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Financial application: compound value)
		
		System.out.print("Enter the monthly saving amount: ");
		double amount = input.nextDouble();
		
		//annual interest rate 5%
		double monthlyInterestRate = 0.05 / 12;
		double interestRate = 1 + monthlyInterestRate;
		
		double month1 = amount * interestRate;
		double month2 = (amount + month1) * interestRate;
		double month3 = (amount + month2) * interestRate;
		double month4 = (amount + month3) * interestRate;
		double month5 = (amount + month4) * interestRate;
		double month6 = (amount + month5) * interestRate;
		
		System.out.println("After the sixth month, the account value is $" + (int)(month6 * 100) / 100.0);
	}
}
