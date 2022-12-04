package chapter04.homeworks;

import java.util.Scanner;

public class Homework19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Business: check ISBN-10

		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		String isbn = input.next();
		int number = Integer.parseInt(isbn);

		int d1 = number / 100000000;
		int d2 = number / 10000000 % 10;
		int d3 = number / 1000000 % 10;
		int d4 = number / 100000 % 10;
		int d5 = number / 10000 % 10;
		int d6 = number / 1000 % 10;
		int d7 = number / 100 % 10;
		int d8 = number / 10 % 10;
		int d9 = number % 10;

		int checksum = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8)
				+ (d9 * 9)) % 11;

		if (checksum == 10)
			System.out.println("The ISBN-10 number is " + number + "X");
		else
			System.out.println("The ISBN-10 number is " + number + checksum);
	}
}
