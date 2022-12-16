package chapter05.exercises;

public class Exercise13 {
	public static void main(String[] args) {

		/*
		 * Convert the following for loop statement to a while loop and to a do-while
		 * loop:
		 */

		long sum = 0;
		for (int i = 0; i <= 1000; i++)
			sum = sum + i;

		long sum = 0;
		int i = 0;
		while (i <= 1000) {
			sum += i;
			i++;
		}

		long sum = 0;
		int i = 0;
		do {
			sum += i;
			i++;

		} while (i <= 1000);
	}

}
