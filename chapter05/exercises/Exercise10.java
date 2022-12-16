package chapter05.exercises;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number, sum = 0, count;
		for (count = 0; count < 5; count++) {
			number = input.nextInt();
			sum += number;
		}
		System.out.println("sum is " + sum);
		System.out.println("count is " + count);
		// sum is 14  
		// count is 5
	}
}
