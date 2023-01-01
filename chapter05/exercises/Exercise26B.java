package chapter05.exercises;

public class Exercise26B {
	public static void main(String[] args) {

		// The program TestContinue in Listing 5.13 rewritten so that the continue is no
		// longer used:

		int sum = 0;
		int number = 0;

		while (number < 20) {
			number++;
			if (number != 10 && number != 11)
				sum += number;
		}
		System.out.println("The sum is " + sum);
	}
}
