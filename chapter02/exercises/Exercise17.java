package chapter02.exercises;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Exercise17 {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter an money in double, for example 11.56: ");
	double money = input.nextDouble();
	
	int remainingMoney = (int)(money * 100);
	
	int numberOfOneDollars = remainingMoney / 100;
	remainingMoney = remainingMoney % 100;
			
	int numberOfQuarters = remainingMoney / 25;
	remainingMoney = remainingMoney % 25;
	
	int numberOfDimes = remainingMoney / 10;
	remainingMoney = remainingMoney % 10;
	
	int numberOfNickels = remainingMoney / 5;
	remainingMoney = remainingMoney % 5;
	
	int numberOfPennies = remainingMoney;
	
	System.out.println("Your amount " + money + " consists of");
	System.out.println(" " + numberOfOneDollars + " dollars");
	System.out.println(" " + numberOfQuarters + " quarters ");
	System.out.println(" " + numberOfDimes + " dimes");
	System.out.println(" " + numberOfNickels + " nickels");
	System.out.println(" " + numberOfPennies + " pennies");
	}
}