package chapter05.homeworks;

public class Homework11 {
	public static void main(String[] args) {

		// Find numbers divisible by 5 or 6, but not both
		int count = 0;
		for (int i = 100; i < 200; i++) {
			if ((i % 5 == 0 || i % 6 == 0) && !(i % 5 == 0 && i % 6 == 0))
				System.out.printf("%d ", i);
			count++;

			if (count % 10 == 0) {
				System.out.println();

			}
		}
	}
}
