package chapter03.exercises;

import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int age = input.nextInt();

		/*
		 * Both A and B are correct and will do the same thing. The code in B is the
		 * preferred way because it shows that the statements are related.
		 */

		// A
		if (age < 16)
			System.out.println("Cannot get a driver's license");
		if (age >= 16)
			System.out.println("Can get a driver's license");

		// B
		if (age < 16)
			System.out.println("Cannot get a driver's license");
		else
			System.out.println("Can get a driver's license");
	}
}
