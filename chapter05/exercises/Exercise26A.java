package chapter05.exercises;

public class Exercise26A {
	public static void main(String[] args) {

		// The program TestBreak in Listing 5.12 rewritten so that the break is no
		// longer used:

		int sum = 0;
		int number = 0;

		while (number < 20 && sum < 100) {
			number++;
			sum += number;
		}
		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
	}
}
