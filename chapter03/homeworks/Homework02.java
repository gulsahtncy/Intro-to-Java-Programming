package chapter03.homeworks;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		
		//Game: add three numbers
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 5 % 10);
						
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
		
		int answer = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
			);	
	}
}
		
		

