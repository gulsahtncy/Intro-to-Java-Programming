package chapter03.homeworks;

import java.util.Scanner;

public class Homework18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Cost of shipping

		System.out.print("Enter the weight of the package: ");
		double packageWeight = input.nextDouble();

		if (0 < packageWeight && packageWeight <= 1) {
			System.out.println("The shipping cost is 3.5 dollars.");
		} else if (1 < packageWeight && packageWeight <= 3) {
			System.out.println("The shipping cost is 5.5 dollars.");
		} else if (3 < packageWeight && packageWeight <= 10) {
			System.out.println("The shipping cost is 8.5 dollars.");
		} else if (10 < packageWeight && packageWeight <= 20) {
			System.out.println("The shipping cost is 10.5 dollars.");
		} else // (packageWeight > 50)
			System.out.println("The package cannot be shipped.");
	}
}
