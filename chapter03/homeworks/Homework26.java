package chapter03.homeworks;

import java.util.Scanner;

public class Homework26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Use the &&, || and ^ operators

		System.out.println("Enter an integer: ");
		int number = input.nextInt();

		boolean condition1 = (number % 5 == 0) && (number % 6 == 0);
		boolean condition2 = (number % 5 == 0) || (number % 6 == 0);
		boolean condition3 = ((number % 5 == 0) && (number % 6 == 0)) ^ ((number % 5 == 0) || (number % 6 == 0));

		System.out.println("Is " + number + " divisible by 5 and 6? " + condition1);
		System.out.println("Is " + number + " divisible by 5 or 6? " + condition2);
		System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + condition3);
	}
}
