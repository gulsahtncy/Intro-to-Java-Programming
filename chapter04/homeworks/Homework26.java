package chapter04.homeworks;

import java.util.Scanner;

public class Homework26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Financial application: monetary units
		
		System.out.print("Enter an amount in double, for example 11.56: ");
		String amount = input.next();
		
		int k = amount.indexOf(',');
		int numberOfOneDollars = Integer.parseInt(amount.substring(0, k));
		int numberOfCents = Integer.parseInt(amount.substring(k + 1));
		
		int numberOfQuarters = numberOfCents / 25;
		numberOfCents = numberOfCents % 25;

		int numberOfDimes = numberOfCents / 10;
		numberOfCents = numberOfCents % 10;

		int numberOfNickels = numberOfCents / 5;
		numberOfCents = numberOfCents % 5;

		int numberOfPennies = numberOfCents;
		
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("    " + numberOfOneDollars + " dollars");
		System.out.println("    " + numberOfQuarters + " quarters ");
		System.out.println("    " + numberOfDimes + " dimes");
		System.out.println("    " + numberOfNickels + " nickels");
		System.out.println("    " + numberOfPennies + " pennies");
	}
}
