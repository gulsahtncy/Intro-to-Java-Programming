package chapter05.homeworks;

public class Homework18 {
	public static void main(String[] args) {

		System.out.println("Pattern D");
		for (int i = 1; i < 7; i++) {
			for (int s = 0; s < i; s++) {
				System.out.print("  ");
			}
			for (int a = 1; a <= 7 - i; a++) {
				System.out.print(a + " ");
			}
			System.out.println();

		}

	}
}
