package chapter05.exercises;

public class Exercise18 {
	public static void main(String[] args) {

		int i = 0;
		do {
			System.out.println(i + 4);
			i++;
		} while (i < 10); // The problem with this code is a missing semicolon after the do-while loop.

		for (int i = 0; i < 10; i++) // The problem with this code is that the semicolon is removed.
			System.out.println(i + 4);
	}
}
