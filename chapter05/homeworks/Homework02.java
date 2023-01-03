package chapter05.homeworks;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {

		// Repeat additions
		Scanner input = new Scanner(System.in);

		long startTime = System.currentTimeMillis();

		final int NUMBER_OF_QUESTIONS = 10;
		int correctCount = 0;
		int count = 0;

		String output = ""; // output string is initially empty

		while (count < NUMBER_OF_QUESTIONS) {

			int number1 = (int) ((Math.random() * 14) + 1);
			int number2 = (int) ((Math.random() * 14) + 1);

			// Prompt the student to answer "What is number1 + number2?"
			System.out.print("What is " + number1 + " + " + number2 + "? ");
			int answer = input.nextInt();
		
			if (number1 + number2 == answer) {
				System.out.println("You are correct!");
				correctCount++; // Increase the correct answer count
				
			} else 
				System.out.println(
						"Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1 + number2));
				
			// Increase the question count
			count++;			
			output += "\n" + number1 + "+" + number2 + "=" + answer
					+ ((number1 + number2 == answer) ? " correct" : " wrong");		
		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println("Total time: " + ((testTime) / 1000) + " seconds");
		System.out.println(count + " questions were asked.");
		System.out.println("You gave " + correctCount + " correct answers.");
		System.out.println(output);

	}

}
