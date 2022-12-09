package chapter05.listing;

import java.util.Scanner;

public class A_RepeatAdditionQuiz {
	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		
		// int wrong counter = 0;
		while (number1 + number2 != answer) {
		    // wrong counter++;
			System.out.println("Wrong answer. Try again. What is "
					 + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
		}
		System.out.println("You got it!");
	}
}