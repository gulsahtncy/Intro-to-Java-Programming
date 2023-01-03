package chapter05.homeworks;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {

		// Count positive and negative numbers and compute the average of numbers
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer, the input ends if it is 0: ");

		int positives = 0;
		int negatives = 0;
		double sum = 0;
		double average = 0;

		int numbers = 1;
		while (numbers != 0) {
			numbers = input.nextInt();

			if (numbers > 0)
				positives++;
			else if (numbers < 0)
				negatives++;
			else
				break;

			sum += numbers;
			average = sum / (positives + negatives);
		}
		System.out.println("The number of positives is " + positives);
		System.out.println("The number of negatives is " + negatives);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + average);
	}
}
