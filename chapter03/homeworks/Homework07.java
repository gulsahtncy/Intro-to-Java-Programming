package chapter03.homeworks;

import java.util.Scanner;

public class Homework07 {
	public static void main(String[] args) {
		
		//Financial application: monetary units
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an money in double, for example 11.56: ");
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
		
		if (numberOfOneDollars == 1) {
			System.out.println("    " + numberOfOneDollars + " dollar");
		} else if (numberOfOneDollars > 1) {
			System.out.println("    " + numberOfOneDollars + " dollars");
		} 	
						  
		if (numberOfQuarters == 1) {
			System.out.println("    " + numberOfQuarters + " quarter ");
		} else if (numberOfQuarters > 1) {
			System.out.println("    " + numberOfQuarters + " quarters ");
		} 		
				 
		if (numberOfDimes == 1) {
			System.out.println("    " + numberOfDimes + " dime ");
		} else if (numberOfDimes > 1) {
		    System.out.println("    " + numberOfDimes + " dimes ");
		} 
			 		  
		if (numberOfDimes == 1) {
			System.out.println("    " + numberOfNickels + " nickel ");
		} else if (numberOfDimes > 1) {
			System.out.println("    " + numberOfNickels + " nickels");
		} 			 
			  
		if (numberOfPennies == 1) {
			System.out.println("    " + numberOfPennies + " penny");
		} else if (numberOfPennies > 1) {
			System.out.println("    " + numberOfPennies + " pennies");
		} 			
	}	 		
}
	
