package chapter05.listing;

import java.util.Scanner;

public class D_SubtractionQuizLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		long startTime = System.currentTimeMillis();

		String output = ""; // output string is initially empty
		int count = 0;
		int correctCount = 0;
		
		while (count < 5) {

			// 1. Generate two random single-digit integers
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);

			// 2. If number1 < number2, swap number1 with number2
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp; 
				}
			
				// 3. Prompt the student to answer "What is number1 – number2?"
				System.out.print("What is " + number1 + " - " + number2 + "? ");
				int answer = input.nextInt();

				// 4. Grade the answer and display the result
				
				output += number1 + " - " + number2 + " = " + answer;
				if (number1 - number2 == answer) {
					System.out.println("You are correct!");
					correctCount++; // Increase the correct answer count
					output += " correct\n";
				} else {
					System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be "
							+ (number1 - number2));
					output += " wrong\n";									
				}
			
				// Increase the question count
			count++;
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("Total time: " + ((testTime) / 1000) + " seconds");
		System.out.println(count + " questions were asked.");
		System.out.println("You gave " + correctCount +" correct answers.");
		System.out.println(output);
	}
}
