package chapter02.homeworks;

import java.util.Scanner;

public class Homework21 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Financial application: calculate future investment value
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter number of years: ");
		double numberOfYears = input.nextDouble();
		
		//futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
		
		double futureInvestmentValue = investmentAmount * Math.pow(1 + (annualInterestRate / 1200), numberOfYears * 12);
		
		System.out.println("Accumulated value is $" + (int)(futureInvestmentValue * 100) / 100.0);		
	}
}
