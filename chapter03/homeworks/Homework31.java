package chapter03.homeworks;

import java.util.Scanner;

public class Homework31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();

		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		double convert = input.nextDouble();

		if (convert == 0) {
			System.out.println("Enter the dollar amount: ");
			double dollar = input.nextDouble();
			double rmbAmount = dollar * rate;
			System.out.println("$" + dollar + " is " + rmbAmount + " yuan");
		} else if (convert == 1) {
			System.out.println("Enter the RMB amount: ");
			double rmb = input.nextDouble();
			double dollarAmount = rmb / rate;
			System.out.println(rmb + " yuan is $" + dollarAmount);
		} else
			System.out.println("Incorrect input!");
	}
}
