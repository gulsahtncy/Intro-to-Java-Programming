package chapter05.homeworks;

public class Homework10 {
	public static void main(String[] args) {

		// Find numbers divisible by 5 and 6
		final int perLine = 10;
		int count = 0;

		for (int i = 100; i < 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				System.out.printf("%d ", i);
				count++;
				if (count % perLine == 0) {
					System.out.println();
				}
			}
		}
	}
}
