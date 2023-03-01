package chapter05.homeworks;

public class Homework18 {
	public static void main(String[] args) {
		PatternA();
		PatternB();
		PatternC();
		PatternD();

	}

	public static void PatternA() {
		System.out.println("Pattern A");
		for (int i = 1; i < 7; i++) {
			for (int a = 1; a <= i; a++) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	public static void PatternB() {
		System.out.println("Pattern B");
		for (int i = 1; i < 7; i++) {
			for (int a = 1; a <= 7 - i; a++) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	public static void PatternC() {
		System.out.println("Pattern C");
		for (int i = 1; i < 7; i++) {
			for (int s = 7 - i; s > 0; s--) {
				System.out.print("  ");
			}
			for (int a = i; a > 0; a--) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	public static void PatternD() {
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
