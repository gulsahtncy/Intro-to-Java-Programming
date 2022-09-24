package chapter02.homeworks;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		
		//Sum the digits in an integer
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int answer = number % 10 + number / 100 + (number / 10) % 10;
		
		System.out.println("The sum of the digits is " + answer);
	}
}
