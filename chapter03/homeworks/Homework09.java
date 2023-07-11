package chapter03.homeworks;

import java.util.Scanner;

public class Homework09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Business: check ISBN-10
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int number = input.nextInt();

		int d1 = number / 100000000;
		int d2 = (number / 10000000) % 10;
		int d3 = (number / 1000000) % 10;
		int d4 = (number / 100000) % 10;
		int d5 = (number / 10000) % 10;
		int d6 = (number / 1000) % 10;
		int d7 = (number / 100) % 10;
		int d8 = (number / 10) % 10;
		int d9 = (number % 10);

		/*
		 * Formula : (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8
		 * * 8 + d9 * 9) % 11
		 */

		int solution = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (solution == 10) {
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
		} else
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + solution);
	}
}
