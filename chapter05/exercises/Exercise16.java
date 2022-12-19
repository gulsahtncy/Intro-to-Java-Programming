package chapter05.exercises;

public class Exercise16 {
	public static void main(String[] args) {

		// A while loop can always be converted into a for loop.

		int i = 1;
		int sum = 0;
		while (sum < 10000) {
			sum = sum + i;
			i++;
		}

		sum = 0;
		for (int i = 1; sum < 1000; i++) {
			sum = sum + i;
		}
	}
}
