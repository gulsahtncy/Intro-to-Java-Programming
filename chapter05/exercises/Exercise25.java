package chapter05.exercises;

public class Exercise25 {
	public static void main(String[] args) {

		/*
		 * int sum = 0; for (int i = 0; i < 4; i++) { if (i % 3 == 0) continue; sum +=
		 * i; }
		 */

		/*
		 * The problem with the while loop version (see the book) is that the varible
		 * called "i" will not be incremented as it should when it is divisible by
		 * three. This is because the continue will cause an jump to the beginning of
		 * the loop. We need to add the increment of "i" in one extra place:
		 */

		int i = 0;
		while (i < 4) {
			if (i % 3 == 0) {
				i++;
				continue;
			}
			sum += i;
			i++;
		}
	}
}
