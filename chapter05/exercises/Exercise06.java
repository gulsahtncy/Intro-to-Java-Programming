package chapter05.exercises;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number, max;
		number = input.nextInt();
		max = number;

		do {
			number = input.nextInt();
			if (number > max)
				max = number;
		} while (number != 0);
		System.out.println("max is " + max);
		System.out.println("number " + number);

		/*
		 * The variable max will hold the largest number entered and number will hold
		 * the last number entered so the output will be: max is 5 - number 0
		 */
	}
}
